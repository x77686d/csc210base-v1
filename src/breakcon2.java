public class breakcon2 {
    public static void main(String args[]) {
        int i = 0;
outer:  for ( ;; ) {
            for ( ;; ) {
                if (true) {
                    break outer;
                    }
                if (true) {
                    continue outer;
                }
            }
        }
    }
}
