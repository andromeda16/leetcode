import org.junit.Assert;

/**
 * Created by Administrator on 6/9/2017.
 */
public class Solution190 {
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
        int a = 0;
        for (int i = 0; i < 31; i++) {
            a |= (n & 1);
            a <<= 1;
            n >>= 1;
        }
        return a + (n & 1);
    }

    public static void main(String[] args) {
        Integer exp = Integer.parseUnsignedInt("2147483648");
        Assert.assertEquals((long) exp, (long) reverseBits(1));
    }
}
