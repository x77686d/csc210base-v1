"""
Times sort() vs. sorted()
Saturday, 12/17/16
"""

from random import randint
import sys
import time

def make_list(n):
    r = []
    for i in range(n):
        r.append(randint(1, 1000000))

    return r

"""
A dead-simple sorted() using sort().
"""
def my_sorted(iterable):
    r = []
    for e in iterable:
        r.append(e)

    list.sort(r)
    return r

def ft(t):
    return "{:.3f}".format(t)
    
def main():
    a = make_list(int(sys.argv[1]))
    #print(a)
    b = a[:]
    c = a[:]

    t1 = time.process_time()
    list.sort(a)
    t2 = time.process_time()
    b2 = sorted(b)
    t3 = time.process_time()
    c2 = my_sorted(c)
    t4 = time.process_time()

    print("sort():", ft(t2-t1))
    print("sorted():", ft(t3-t2))
    print("my_sorted():", ft(t4-t3))

main()
