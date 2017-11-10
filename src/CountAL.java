import java.util.ArrayList;

public class CountAL {
    public static void main(String args[]) {
        int size = Integer.parseInt(args[0]);
        ArrayList<Integer> vals = new ArrayList<>(size);
        for (int i = 0; i < size; i++)
            vals.add(0);
        if (args.length == 2) {
            int value = Integer.parseInt(args[1]);
            int n = count(value, vals);
            System.out.format("Found %d occurrences of %d\n", n, value);
            }
    }
    static int count(int wanted, ArrayList<Integer> values)
    {
        int result = 0;
    
        for (int value: values)
            if (value == wanted)
                result += 1;
    
        return result;
    }
}
/*
Sat Jun 10 12:13:54 2017 on gaither
How is this code going parallel?

mac ~/210/src 2911 % n=100000000
mac ~/210/src 2912 % time jcr CountAL $n

real    0m1.552s
user    0m3.470s
sys     0m0.211s
mac ~/210/src 2913 % time jcr CountAL $n 7
Found 0 occurrences of 7

real    0m1.681s
user    0m3.699s
sys     0m0.216s
mac ~/210/src 2914 % time jcr CountAL $n 0
Found 100000000 occurrences of 0

real    0m1.712s
user    0m3.722s
sys     0m0.223s

*/




