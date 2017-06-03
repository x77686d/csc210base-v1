import java.util.*;

public class typedis3 {
    public static void main(String args[]) {
        System.out.println("0s in array: " + count(0,
            new ArrayList<>(Arrays.asList(new Integer[] {5, 3, 0, 5, 0, 2, 0}))));

        ArrayList<Character> a2 = new ArrayList<>();
        a2.add('a');
        a2.add('b');
        System.out.println(a2);

        System.out.println("t's in test: " + count('t',
            new ArrayList<>(Arrays.asList("test this".toCharArray()))));

        //System.out.println(count(5, a));
        //System.out.println(count(10, a));
        }

    public static <T> int f(T x)
    {
        return 1;
    }

public static <T> int count(T wanted, T[] values)
{
    System.out.println(values);
/*
    int result = 0;

    for (T value: values)
        if (value.equals(wanted))
            result += 1;

    return result;
*/
}
}
        
        
public static <T> int count(T wanted, ArrayList<T> values)
{
    System.out.println(values);
    int result = 0;

    for (T value: values)
        if (value.equals(wanted))
            result += 1;

    return result;
}
}
        
        
