package Java;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram
{
    static boolean checkAnagram(String a, String b)
    {
        char[] arrayA = a.toLowerCase().toCharArray();
        char[] arrayB = b.toLowerCase().toCharArray();

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        return Arrays.equals(arrayA, arrayB);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean ret = checkAnagram(sc.nextLine(), sc.nextLine());
        System.out.println((ret) ? "Anagram" : "Not Anagram");
    }
}
