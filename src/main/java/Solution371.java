import org.junit.Assert;

public class Solution371 {
    public static int getSum(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        if (a == b) {
            return a << 1;
        }

        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        Assert.assertEquals(1, getSum(1, 0));
        Assert.assertEquals(1, getSum(0, 1));
        Assert.assertEquals(4, getSum(2, 2));
        Assert.assertEquals(3, getSum(1, 2));
        Assert.assertEquals(0, getSum(2, -2));
    }
}