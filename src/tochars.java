public class tochars {
    static char[] toChars(String s) {
        char[] r = new char[s.length()];
        for (int i = 0; i < r.length; i++) {
            r[i] = s.charAt(i);
            }
        return r;
    }
}
    
