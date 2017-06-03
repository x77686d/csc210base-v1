public class if1 {
    static String reduce(String s) { return s; };
    static int findBase(String s) { return 2; }
    static int base;
    public static void main(String args[]) {
        int i = 5;
        if (i >= 0)
            System.out.println("i is not negative");

        int limit = 0;
        String s = "x";
        if (s.length() >= limit) {
            String reduced = reduce(s);
            base = findBase(reduced);
        }
            
        }
    }
