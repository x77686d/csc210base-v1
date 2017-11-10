public class GenList<T> {
    private int numValues; // The number of values we're actually holding
    private T[] values;  // The first numValues elements have a meaningful
                           // value; the rest are considered to be empty.
    private static final int INITIAL_SIZE = 2;
    
    public GenList() {
        values = new T[INITIAL_SIZE];
        numValues = 0;
        }
    
    public int length() { return numValues; }

    public void add(T value) {
        if (numValues == values.length)
            expand();
        values[numValues] = value;
        numValues++;
        }

    private void expand() {
        T[] newValues = new T[values.length * 2];
        System.arraycopy(values, 0, newValues, 0, values.length);
        values = newValues;
        }

    public T at(int pos) {
        if (pos < 0) {
            pos = numValues + pos;
            }
    
        if (pos < 0 || pos >= numValues) {
            throw new IndexOutOfBoundsException();
            }
    
        return values[pos];
        }

    public String toString() {
        String result = "[";
        String sep = "";
        for (int i = 0; i < numValues; i++) {
            result += sep + values[i];
            sep = ",";
            }
        return result + "]";
        }

    }
