public class for3 {
    public static void main(String args[]) {
        String s = "iiotdi?tookts";
        for (int first = 0, last = s.length()-1;
            first <= last;
            first += 1, last -= 1) {
                System.out.println("" + s.charAt(first) + s.charAt(last));
            }
    }
}
