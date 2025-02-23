package Algorithm;

    /*     6
        20   21  22  23
     */

public class BeautifulDaysAtTheMovies {
    public static int beautifulDays(int i, int j, int k) {
        int count = 0;
        for (int day = i; day <= j; day++) {
            int reversedDay = reverseNumber(day);
            int difference = Math.abs(day - reversedDay);
            if (difference % k == 0) {
                count++;
            }
        }
        return count;
    }

    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        int i = 250;
        int j = 254;
        int k = 6;
        System.out.println(beautifulDays(i, j, k));
    }
}
