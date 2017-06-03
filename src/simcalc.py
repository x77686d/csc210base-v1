def main():
    first = int(input("First? "))
    second = int(input("Second? "))
    result = calc(first, second)
    show(result)

def calc(a,b):
    return max(a,b) * (a + b)

def show(value):
    print("Result =", value)

main()
