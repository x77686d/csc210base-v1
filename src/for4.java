public class for4 {
    public static void main(String args[]) {
        charBox(5,3,".-");
        charBox(10,4,"*");
    }

    static void charBox(int width, int height, String s) {
        int pos = 0;
        for (int row = 1; row <= height; row += 1) {
            for (int col = 1; col <= width; col += 1) {
                System.out.print(s.charAt(pos % s.length()));
                pos += 1;
            }
            System.out.println();
        }
    }
}
