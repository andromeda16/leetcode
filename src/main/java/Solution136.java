import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by Administrator on 5/29/2017.
 */
public class Solution136 {
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> a = new HashMap();
        for (int i : nums) {
            int v = a.containsKey(i) ? a.get(i) + 1 : 1;
            a.put(i, v);
        }
        for (Map.Entry<Integer, Integer> entry : a.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Assert.assertEquals(singleNumber(new int[] {1}), 1);
    }
}