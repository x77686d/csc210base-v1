def main():
    x = f(3,4)
    show_result(x)

def f(a,b):
    return max(a,b) * 17

def show_result(value):
    print("Result: " + str(value))

main()
