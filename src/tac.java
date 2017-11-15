public class tac {
    public static void main(String args[]) {
        ArrayList<String> lines = new ArrayList<String>();
        Scanner scanner = new Scanner(new File(args[0]));

        while (true) {
            String line = scanner.nextLine()
            System.out.println(line);
            lines.add(line);
            }

        for (int i = lines.size() - 1; i >= 0; i--) {
            System.out.println(lines.get(i));
            }

        }
    }
            
