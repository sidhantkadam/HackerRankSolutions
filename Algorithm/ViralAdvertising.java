package Algorithm;

         /*
  1      5/2 = 2 -> 2
  2      5/2 = 2 * 3 = 6 -> 6/2 = 3
  3      6/2 = 3 * 3 = 9 -> 9/2 = 4
  4      9/2 = 4 * 3 = 12 -> 12/2 = 6
  5      12/2 = 6 * 3 = 18 -> 18/2 = 9
  6      18/2 = 9 * 3 = 24 -> 24/2 = 15
         */

public class ViralAdvertising
{
    public static int viralAdvertising(int n) {
        // Write your code here
        int finalSum = 0;
        int shared = 5;
        for(int i=1;i<=n;i++)
        {
            int liked = shared / 2;
            finalSum = finalSum + liked;
            shared = liked * 3;
        }
        return finalSum;
    }

    public static void main(String[] args) {
    int n= 5;
    System.out.println(viralAdvertising(n));
    }
}
