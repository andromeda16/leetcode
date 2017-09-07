import java.util.Queue;

/**
 * Created by Administrator on 6/2/2017.
 */
public class Solution5 {

    public static String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        String res = "";
        int currLength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isPalindrome(s, i - currLength, i)) {
                res = s.substring(i - currLength, i + 1);
                currLength += 1;
            }

            if (isPalindrome(s, i - currLength - 1, i)) {
                res = s.substring(i - currLength - 1, i + 1);
                currLength += 2;
            }
        }

        return res;
    }

    private static boolean isPalindrome(String s, Integer left, Integer right) {
        if (left > right || left < 0 || right < 0) {
            return false;
        }

        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        longestPalindrome("cbba");
    }
}
