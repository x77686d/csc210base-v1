public class printargs {
    public static void main(String args[]) {
        if (args.length != 0)
            System.out.format("%d command-line arguments:\n", args.length);
        else
            System.out.format("No command-line arguments!\n");
        for (String arg: args) {
            System.out.format("'%s'\n", arg);
            }
        }
    }
