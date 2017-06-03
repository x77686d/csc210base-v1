public class shortcirc1 {
    public static void main(String args[]) {
        int numItems = 3, total = 12, minimum = 1;
if (numItems > 0) {
    if (total / numItems > minimum) {
        process();
    }
}

if (numItems > 0 && total / numItems > minimum) {
    process();
}
    }

    private static void process() {
        System.out.println("process called");
        
    }
    }
