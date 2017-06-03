import sys
def main():
    sys.argv.pop(0)
    vals = [0] * int(sys.argv[0])
    if len(sys.argv) == 2:
        value = int(sys.argv[1])
        n = count(value, vals)
        print("Found {} occurrences of {}".format(n, value))

def count(wanted, values):
    """return the number of times wanted appears in values"""
    result = 0

    for value in values:
        if value == wanted:
            result += 1

    return result

main()
    
