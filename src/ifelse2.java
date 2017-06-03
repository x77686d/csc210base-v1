public class ifelse2 {
    public static void main(String args[]) {
        double temperature = 101;

        for (int i = 68; i < 102; i++) {
            System.out.format("At %d it is %s\n", i, weather(i));
            }
        }
        

    static String weather(int temperature) {
        String result;
        if (temperature > 100) {
            result = "really hot!";
        } else if (temperature > 85) {
            result = "hot!";
        } else if (temperature > 70) {
            result = "nice!";
        } else {
            result = "freezing!";
        }

        return result;
        }

    }
