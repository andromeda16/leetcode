
public class Solution479 {
    public static int largestPalindrome(int n) {
        if (n < 1 || n > 8) {
            return -1;
        }

        if (n == 1) {
            return 9;
        }

        final int num = 1337;

        int a = (int) Math.pow(10, n) - 1, b = a;
        int res = a * b;

        while (!isPalindrome(res)) {
            b--;
            res = a * b;
        }
        return res % num;
    }


    private static boolean isPalindrome(int num) {
        if (num < 10) {
            return true;
        }

        long rev = 0;
        while (num > 0) {
            long r = num % 10;
            rev = rev * 10 + r;
            num /= 10;
        }

        if (rev > Integer.MAX_VALUE) {
            return false;
        }

        return (int) rev == num;
    }


    public static void main(String[] args) {
        largestPalindrome(2);
    }
}