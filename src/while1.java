import java.util.Scanner;

public class while1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (scanner.hasNextLine()) {
            scanner.nextLine();
            n += 1;
        }
        System.out.println(n);
    }
}
