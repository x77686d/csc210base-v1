public class Counter2 {
    private String name;
    private int count = 0;
    private static int numCounters = 0;

    public Counter2(String name) {
        this.name = name;
        numCounters++;
    }

    public void click() { count++; }

    public int getCount() { return count++; }

    public String toString() {
        return name + "'s count is " + count;
    }

    public static int getNumCounters() { return numCounters; }
}
