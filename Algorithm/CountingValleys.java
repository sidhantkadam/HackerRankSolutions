package Algorithm;

public class CountingValleys
{
    //  Not Implemented

    public static int countingValleys(int steps, String path) {

        return steps;
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

    int steps = 8;
    String path = "UDDDUDUU";
    System.out.println(countingValleys(steps, path));
    }
}
