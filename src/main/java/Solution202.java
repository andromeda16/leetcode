import org.junit.Assert;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 6/15/2017.
 */
public class Solution202 {

    public static boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }

        Set<Integer> set = new HashSet();

        while(set.add(n)) {
            int sum = 0;
            while (n != 0) {
                int r = n % 10;
                sum += r * r;
                n /= 10;
            }

            n = sum;

            if (n == 1) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Assert.assertEquals(true, isHappy(19));
    }
}
