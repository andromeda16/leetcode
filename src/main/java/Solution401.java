import org.junit.Assert;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 6/9/2017.
 */
public class Solution401 {

    public static List<String> readBinaryWatch(int num) {
        List<String> time = new ArrayList<String>();
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                if (Integer.bitCount(h) + Integer.bitCount(m) == num) {
                    time.add(String.format("%d:%02d", h, m));
                }
            }
        }
        return time;
    }

    public static void main(String[] args) {
        List<String> exp = Arrays.asList("1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32");
        List<String> act = readBinaryWatch(1);
        Assert.assertEquals(exp.size(), act.size());
        for (String s: act) {
            Assert.assertTrue(exp.contains(s));
        }
    }
}
