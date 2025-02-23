package Algorithm;

        //Not Implemented

public class SaveThePrisoner {
    public static int saveThePrisoner(int n, int m, int s) {
        int count = 0;
        for (int i = s; i <= m; i++) {
            for (int j = i; j <= m; j++) {
                if (j == n) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 3;      //no of prisoners
        int m = 7;      //no of candies
        int s = 3;      //starting

        System.out.println(saveThePrisoner(n, m, s));
    }
}
