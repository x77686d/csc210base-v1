public class switch1 {
    static int calcWeight(String s) {
        int weight = 0;
        for (int i = 0; i < s.length(); i++) {
switch (s.charAt(i)) {
    case '<':
    case '>':
        weight += 2;
        break;
    case '=':
        weight += 3;
        break;
    default:
        weight += 1;
        break;
}
        }
        return weight;
    }
}


