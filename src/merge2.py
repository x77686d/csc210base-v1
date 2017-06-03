"""
Sunday, 12/04/16

Written to study the performance of using length checks vs. exceptions to terminate a merge loop.

Here are numbers from my 2015 MacBook Pro, 2.8Ghz i7.  I'm surprised by it, but it seems like
the exception-based version cuts the time by about a third:

    % py3 merge2.py -t
    1.803s for 20000 merges of 100 element lists with ck
    1.276s for 20000 merges of 100 element lists with ex
    
    4.688s for 10000 merges of 500 element lists with ck
    3.206s for 10000 merges of 500 element lists with ex
    
    11.233s for 5000 merges of 2000 element lists with ck
    8.011s for 5000 merges of 2000 element lists with ex

I was surprised that changing
    while len(a) and len(b):
to
    while len(a) != 0 and len(b) != 0:
produced only a small slow-down:

    % py3 merge2.py -t
    1.885s for 20000 merges of 100 element lists with ck
    1.284s for 20000 merges of 100 element lists with ex
    
    4.877s for 10000 merges of 500 element lists with ck
    3.220s for 10000 merges of 500 element lists with ex
    
    11.761s for 5000 merges of 2000 element lists with ck
    8.068s for 5000 merges of 2000 element lists with ex

For the record, here's data from an older version, which made just two lists and then cloned them before each merge.

    % time py3 merge2.py 100 20000 ck
    user    0m1.835s
    
    % time py3 merge2.py 100 20000 ex
    user    0m1.202s

    % time py3 merge2.py 500 10000 ck
    user    0m4.671s

    % time py3 merge2.py 500 10000 ex
    user    0m3.002s

    time py3 merge2.py 2000 5000 ck
    user    0m11.087s

    % time py3 merge2.py 2000 5000 ex
    user    0m7.383s

But as the lists get longer, the speed-up shrinks:
    % time py3 merge2.py 20000 100 ex
    user    0m10.576s

    % time py3 merge2.py 20000 100 ck
    user    0m11.324s

"""

import random
import sys
import time
import os

def main():
    random.seed(10)
    check_merge()

    if len(sys.argv) == 2 and sys.argv[1] == "-t":
        runself()
        sys.exit(0)

    if len(sys.argv) != 4:
        print("Usage:", format(sys.argv[0]), "LIST-LENGTH NUM-MERGES TYPE")
        print(" TYPE is ex or ck")
        sys.exit(1)

    list_len = int(sys.argv[1])
    num_merges = int(sys.argv[2])
    merge_type = sys.argv[3]

    lists = generate_lists(num_merges * 2, list_len)
    #print(repr(lists))

    merge_fcn = ex_merge if merge_type == "ex" else ck_merge

    start = time.process_time()
    do_merges(merge_fcn, num_merges, lists)
    elapsed = time.process_time() - start
    print("{:.3f}s for {} merges of {} element lists with {}".format(elapsed, num_merges, list_len, merge_type))

def do_merges(f, n, lists):
    for i in range(n):
        f(lists.pop(),lists.pop())

def ex_merge(a, b):
    r = []
    
    try:
        while True:
            r.append((a if a[0] < b[0] else b).pop(0))
    except:
        return r + a + b
        
def ck_merge(a, b):
    r = []
    
    #while len(a) != 0 and len(b) != 0:
    while len(a) and len(b):
        r.append((a if a[0] < b[0] else b).pop(0))
        
    return r + a + b

#
# generate a list of num_lists lists, each num_elems long
#
def generate_lists(num_lists, num_elems):
    r = []
    for i in range(num_lists):
        r.append(generate_list(num_elems))

    return r

def generate_list(nelems):
    r = []
    for i in range(nelems):
        r.append(random.randint(1,10000))

    r = sorted(r)
    #print(repr(r))

    return r

# Detect hallucinations...
def check_merge():
    a = generate_list(1000)
    b = generate_list(1000)
    
    ex = ex_merge(a[:],b[:])
    ck = ck_merge(a[:],b[:])
    
    assert ex == ck
    assert len(ex) == len(ck) == len(a) + len(b)
    assert sorted(a + b) == ck == ex

def runself():

    #for args in ["10 20", "500 10", "2000 50"]:
    for args in ["100 20000", "500 10000", "2000 5000"]:
        for type in ["ck","ex"]:
            os.system("python3 merge2.py {} {}".format(args, type))
        print()

main()
