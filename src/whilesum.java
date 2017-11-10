//import java.util.Scanner;

public class whilesum {
    public static void main(String args[]) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double sum = 0.0;
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                sum += scanner.nextDouble();
            }
            else {
                scanner.next();
            }
        }
        System.out.println(sum);
    }
}
