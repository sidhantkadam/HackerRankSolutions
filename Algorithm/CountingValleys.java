package Algorithm;

public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        int count = 0;
        int countValley = 0;
        for (char c : path.toCharArray()) {
            if (c == 'D') {
                count--;
            } else if (c == 'U') {
                count++;
                if (count == 0) {
                    countValley++;
                }
            }
        }
        return countValley;
    }

    public static void main(String[] args) {
        /*
       12
       DDUUDDUDUUUD
       o/p -> 2

       _          /\_
        \  /\    /
         \/  \/\/

       8
       UDDDUDUU
       o/p -> 1

       _      /\_
        \    /
         \/\/
       */

        int steps = 12;
        String path = "DDUUDDUDUUUD";
        System.out.println(countingValleys(steps, path));
    }
}
