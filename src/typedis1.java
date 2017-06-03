public class typedis1 {
    public static void main(String args[]) {
        int a[] = {5, 3, 0, 5, 0, 2, 0};
        System.out.println(count(0, a));
        System.out.println(count(5, a));
        System.out.println(count(10, a));
        }

public static int count(int wanted, int[] values)
{
    int result = 0;

    for (int value: values)
        if (value == wanted)
            result += 1;

    return result;
}
}
        
        
