public class condexpr1 {
    public static void main(String args[]) {
        //System.out.println('a' < 'b' ? 'c' : 3);

        for (int n = 0; n < 10; n++) {
            System.out.println("Processed point" + (n == 1 ? "":"s"));
            }
            
        for (int n = 0; n < 10; n++) {
            System.out.println("Processed " + (n == 0 ? "no":n) + " point" + (n == 1 ? "":"s"));
            }
        }
    }
