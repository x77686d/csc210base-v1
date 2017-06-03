import java.util.Arrays;

public class typedis2 {
    public static void main(String args[]) {
        Integer a[] = {5, 3, 0, 5, 0, 2, 0};
        System.out.println(count(0, a));

        System.out.println(count('t', "test this".toCharArray()));

        //System.out.println(count(5, a));
        //System.out.println(count(10, a));
        }

    public static <T> int f(T x)
    {
        return 1;
    }

public static <T> int count(T wanted, T[] values)
{
    int result = 0;

    for (T value: values)
        if (value == wanted)
            result += 1;

    return result;
}
}
        
        
