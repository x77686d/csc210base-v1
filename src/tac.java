import java.io.File;
import java.util.*;

public class tac {
    public static void main(String args[]) throws Exception {
        ArrayList<String> lines = new ArrayList<String>();
        Scanner scanner = new Scanner(new File(args[0]));

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            lines.add(line);
            }

        for (int i = lines.size() - 1; i >= 0; i--) {
            System.out.println(lines.get(i));
            }

        }
    }
            
