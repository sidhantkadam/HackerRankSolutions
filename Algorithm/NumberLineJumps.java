package Algorithm;

public class NumberLineJumps {
    public static String kangaroo(int x1, int v1, int x2, int v2) {

        if (x2 > x1 && v2 >= v1) {
            return "NO";
        }
        if (x1 > x2 && v1 >= v2) {
            return "No";
        }

        while (true) {
            x1 = x1 + v1;
            x2 = x2 + v2;
            if (x1 == x2) {
                return "YES";
            }
            if ((x1 > x2 && v1 >= v2) || (x2 > x1 && v2 >= v1)) {
                return "NO";
            }
        }
    }

    public static void main(String[] args) {
        int x1 = 0;
        int v1 = 3;
        int x2 = 4;
        int v2 = 2;

        System.out.println(kangaroo(x1, v1, x2, v2));
    }
}
