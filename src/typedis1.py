def count(wanted, values):
    """return the number of times wanted appears in values"""
    result = 0

    for value in values:
        if value == wanted:
            result += 1

    return result

def main():
    vals = [5, 3, 0, 5, 0, 2, 0]

    print(count(0,vals))
    print(count(5,vals))
    print(count(10,vals))

    print(count("t", "testing"))
    print(count("a", "a this or a that".split()))
    print(count([], [1, 5, [], [[]], [3,4]]))

main()
