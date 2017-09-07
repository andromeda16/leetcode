/**
 * Created by Administrator on 8/6/2017.
 */
public class Solution408 {

    public static boolean validWordAbbreviation(String word, String abbr) {
        int l1 = 0, r1 = word.length(), l2 = 0, r2 = abbr.length();
        while (l1 < r1 && l2 < r2) {
            if (word.charAt(l1) == abbr.charAt(l2)) {
                l1++;
                l2++;
                continue;
            }

            if (!Character.isDigit(abbr.charAt(l2))) {
                return false;
            }

            int i = 0;
            while (Character.isDigit(abbr.charAt(l2))) {
                i = i * 10 + Character.getNumericValue(abbr.charAt(l2));
                l2++;
            }
            l1 += i;
        }
        return l1 == r1 && l2 == r2;
    }


    public static void main(String[] args) {
        validWordAbbreviation("word", "wo1d");
    }
}
