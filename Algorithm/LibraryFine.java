package Algorithm;

public class LibraryFine
{
    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int fine=0;
        int daysDiff = Math.abs(d1-d2);
        int monthDiff = Math.abs(m1-m2);
        if(y1>y2)
        {
            fine = 10000;
        }
        else if(y1==y2)
        {
            if(m1>m2)
            {
                fine = 500*monthDiff;
            }
            else if(m1==m2 && d1>d2)
            {
                fine = 15 * daysDiff;
            }
        }
        return fine;
    }

    public static void main(String[] args) {
        int d1=9, d2=6;
        int m1=6, m2=6;
        int y1=2018, y2=2018;
        System.out.println(libraryFine(d1,d2,m1,m2,y1,y2));
    }
}
