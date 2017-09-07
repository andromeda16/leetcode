/**
 * Created by Administrator on 6/21/2017.
 */
public class Solution507 {

    public static boolean checkPerfectNumber(int num) {
        if (num <= 0) return false;
        if (num == 1) return true;

        int n = num;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                int k = num / i;
                n -= k;
                n -= i;
            }
        }

        return n == 1;
    }

    public static void main(String[] args) {
        checkPerfectNumber(28);
    }
}
