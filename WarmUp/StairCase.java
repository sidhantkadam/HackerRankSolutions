package WarmUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

    public static void staircase(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}

public class StairCase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
