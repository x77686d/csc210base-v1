public class simcalc {
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String args[]) {
        int first = promptForInt("First? ");
        int second = promptForInt("Second? ");
        int result = calc(first, second);
        show(result)
        }

    static int calc(int a, int b) {
        return Math.max(a,b) * (a + b);
        }

    static void show(int value) {
        System.out.println("Result = " + value);
        }

    static int promptForInt(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
        
    }
