package Algorithm;

public class SherlockAndSquares
{
    public static int squares(int a, int b) {
        // Write your code here
        int count = 0;
        for(int i=a;i<=b;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if( j==(i/j) && i%j==0)
                {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a=3;
        int b=9;
        System.out.println(squares(a,b));

//        for(int i=a;i<=b;i++)
//        {
//            for(int j=0;j<=b;j++)
//            {
//                if(Math.sqrt(i)==j)
//                {
//                    count++;
//                }
//            }
//        }
//        return count;
    }
}
