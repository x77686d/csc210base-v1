import java.io.File;
import java.util.*;

public class tally {
    public static void main(String args[]) throws Exception {
        HashMap<String,Integer> counts = new HashMap<String,Integer>();

        Scanner scanner = new Scanner(new File(args[0]));

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            for (String word: line.split(" ")) {
                if (counts.containsKey(word)) {
                    counts.put(word,counts.get(word)+1);
                    }
                else {
                    counts.put(word,1);
                    }
                }
            }

        System.out.println(counts);

        for (String key: counts.keySet()) {
            System.out.format("%s: %d\n", key, counts.get(key));
            }
        }
    }
            
