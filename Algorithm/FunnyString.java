package Algorithm;

import java.util.ArrayList;
import java.util.List;

public class FunnyString {

    public static String funnyString(String s) {
        String result = "";
        StringBuilder reverse = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; --i) {
            reverse.append(s.charAt(i));
        }
        System.out.println(reverse);
        List<Integer> strAscii = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            strAscii.add((int) s.charAt(i));
        }
        System.out.println(strAscii);
        List<Integer> revAscii = new ArrayList<>();
        for (int i = 0; i < reverse.length(); i++) {
            revAscii.add((int) reverse.charAt(i));
        }
        System.out.println(revAscii);
        List<Integer> strDiff = new ArrayList<>();
        for (int i = 0; i < strAscii.size() - 1; i++) {
            int diff = strAscii.get(i) - strAscii.get(i + 1);
            strDiff.add(Math.abs(diff));
            System.out.println(strDiff);
        }
        List<Integer> revDiff = new ArrayList<>();
        for (int i = 0; i < revAscii.size() - 1; i++) {

            int diff = revAscii.get(i) - revAscii.get(i + 1);
            revDiff.add(Math.abs(diff));
        }
        System.out.println(revDiff);

        boolean isFunny = true;
        for (int i = 0; i < strDiff.size(); i++) {
            if (!strDiff.get(i).equals(revDiff.get(i))) {
                isFunny = false;
                break;
            }
        }
        result = isFunny ? "Funny" : "Not Funny";
        return result;
    }

    public static void main(String[] args) {
        String s = "acxz";
        System.out.println(funnyString(s));
    }
}
