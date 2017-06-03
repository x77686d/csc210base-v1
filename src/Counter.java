public class Counter {
    private String name;
    private int count = 0;

    public Counter(String name) {
        this.name = name;
    }

    public void click() { ++count; }

    public int getCount() { return count; }

    public String toString() {
        return name + "'s count is " + count;
    }
}
