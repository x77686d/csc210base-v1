public class whole1 {
    public static void main(String args[]) {
        int x = f(3,4);
        show_result(x);
        }

    static int f(int a, int b) {
        return Math.max(a,b) * 17;
        }

    static void show_result(int value) {
        System.out.println("The result is " + value);
        }
        
    }
