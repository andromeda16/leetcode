import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by HP on 5/25/2017.
 */
public class Solution7 {
    public static int reverse(int x) {
        long r = 0;
        while (x != 0) {
            r = r * 10 + x % 10;
            x /= 10;
        }
        if (r > Integer.MAX_VALUE || r < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) r;
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> cases = new HashMap<Integer, Integer>();
//        cases.put(123, 321);
//        cases.put(-123, -321);
//        cases.put(-1234, -4321);
        cases.put(1534236469, 0);

        for (Map.Entry<Integer, Integer> c : cases.entrySet()) {
            Integer y = reverse(c.getKey());
            Integer expY = c.getValue();
            Assert.assertEquals(expY, y);
        }
    }
}
