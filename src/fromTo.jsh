
int[] fromTo(int from, int to) {
    if (to < from)
        return null;

    int[] result = new int[to-from+1];
    for (int pos = 0, value = from; value <= to; pos++, value++) {
        result[pos] = value;
    }

    return result;
}
