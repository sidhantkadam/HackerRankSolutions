package Algorithm;

public class UtopianTree {

    public static int utopianTree(int n) {
        int height = 1;
        if(n==0)
        {
            return height;
        }
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                height = height * 2;
            }
            else {
                height = height + 1;
            }
        }
        return height;
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(utopianTree(n));
    }
}
