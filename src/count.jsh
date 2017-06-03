int count(int wanted, int[] values)
{
    int result = 0;

    for (int value: values)
        if (value == wanted)
            result += 1;

    return result;
}
