def count(c):
    for c in s:
        if c == "<" or c == ">":
            r += "p"
        elif c == "+" or c == "-" or c == "*":
            r += "o"
        elif c >= "0" and c <= "9":
            r += "d"
        else:
            r += "_";

    return r
