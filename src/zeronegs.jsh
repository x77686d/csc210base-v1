int zeronegs(int[] a) {
    int numZeroed = 0;
    for (int i = 0; i < a.length; i++) {
        if (a[i] < 0) {
            a[i] = 0;
            numZeroed++;
        }
    }
    return numZeroed;
}
