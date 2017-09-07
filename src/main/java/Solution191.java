import org.junit.Assert;

/**
 * Created by Administrator on 6/5/2017.
 */
public class Solution191 {

    public static int hammingWeight(int n) {
        int i = 0;
        while (n != 0) {
            i += n & 1;
            n = n >>> 1;
        }
        return i;
    }

    public static void main(String[] args) {
        Assert.assertEquals(3, hammingWeight(11));
        Assert.assertEquals(1, hammingWeight(1));
        Assert.assertEquals(1, hammingWeight(2));
        Assert.assertEquals(2, hammingWeight(3));
    }
}
