import java.util.Scanner;
public class simcalc {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("First? ");
        int first = scanner.nextInt();
        
        System.out.print("Second? ");
        int second = scanner.nextInt();
        
        int result = calc(first, second);
        show(result);
        }

    static int calc(int a, int b) {
        return Math.max(a,b) * (a + b);
        }

    static void show(int value) {
        System.out.println("Result = " + value);
        }
    }
