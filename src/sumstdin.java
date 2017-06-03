import java.util.Scanner;

public class sumstdin {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
            }

        System.out.format("sum = %d\n", sum);
        }
    }
