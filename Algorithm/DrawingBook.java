package Algorithm;

    /*
    One Test Case is failing..
     */


public class DrawingBook {

    public static int pageCount(int n, int p) {
        // Write your code here
        int countFront = 0;
        int countBack = 0;
        for(int i=0;i<=p;i+=2)
        {
            countFront++;
        }
        for(int i = n;i>=p;i-=2)
        {
            countBack++;
        }
        return Math.min(countFront -1 , countBack - 1);
    }

    public static void main(String[] args) {
        int n = 6;
        int p = 2;
        System.out.println(pageCount(n, p));
    }
}
