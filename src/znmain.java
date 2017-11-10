import java.util.Arrays;
public class znmain {
    public static void main(String args[]) {
        int[] nums = {-1, -2, -3, 4};
        int n = zeronegs(nums);
        System.out.format("Zeroed %d values: %s\n",
            n, Arrays.toString(nums));
    }

    static int zeronegs(int[] a) {
        int numZeroed = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                a[i] = 0;
                numZeroed++;
            }
        }
        return numZeroed;
    }
}
