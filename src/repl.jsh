int [] repl(int value, int n) {
    if (n < 0)
        return null;

    int result[] = new int[n];
    for (int i = 0; i < n; i++)
        result[i] = value;

    return result;
}
        
