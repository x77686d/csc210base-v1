int sum(int[] a)
{
    int result = 0;

    for (int i = 0; i < a.length; i++) {
        result += a[i];
    }

    return result;
}

int sum_e(int[] a)
{
    int result = 0;

for (int value: a)
    result += value;

    return result;
}

int[] largerSum(int[] a, int[] b)
{
    if (sum(a) > sum(b))
        return a;
    else
        return b;
}

int[] fromTo(int from, int to) {
    if (to < from)
        return null;

    int[] result = new int[to-from+1];
    for (int pos = 0, value = from; value <= to; pos++, value++) {
        result[pos] = value;
    }

    return result;
}

void reverse_in_place(int a[]) {
    for (int i = 0, j = a.length - 1; i < j; i++, j--) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
        }
}

int[] reverse_make_new(int a[]) {
    int[] result = new int[a.length];
    for (int i = 0, j = a.length - 1; i < a.length; i++, j--) {
        result[i] = a[j];
        }
    return result;
}
