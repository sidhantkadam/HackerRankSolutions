package Algorithm;

public class HalloweenSale
{
    public static int howManyGames(int p, int d, int m, int s)
    {
        // Return the number of games you can buy
        // 20+17+14+11+8=70=s
        int addition = 0;
        int count=0;
        while (addition + p <= s)
        {
            for (int i = p; i >= m; i -= d) {
                count++;
                addition = addition + i;
                p = Math.max(p-d,m);
            }
        }
//        System.out.println(addition);
        return count;
    }

    public static void main(String[] args) {
            int p=20;
            int d=3;
            int m=6;
            int s=85;

        System.out.println(howManyGames(p,d,m,s));
    }
}
