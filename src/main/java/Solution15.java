import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Administrator on 6/14/2017.
 */
public class Solution15 {

    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        Arrays.sort(nums);

        HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            myMap.put(nums[i], i);
        }

        List<List<Integer>> pairs = new ArrayList<List<Integer>>();
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                int n = (-1) * (nums[i] + nums[j]);
                if (myMap.containsKey(n) && myMap.get(n) > j) {
                    List<Integer> list = Arrays.asList(nums[i], nums[j], n);
                    pairs.add(list);
                }
                while (j + 1 < size && nums[j + 1] == nums[j]) {
                    j++;
                }
            }
            while (i + 1 < size && nums[i + 1] == nums[i]) {
                i++;
            }
        }
        return pairs;
    }

    public static List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        if (nums == null || nums.length <= 2) {
            return res;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int lo = i + 1, hi = nums.length - 1, sum = 0 - nums[i];
                while (lo < hi) {
                    if (nums[lo] + nums[hi] == sum) {
                        res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        while (lo < hi && nums[lo] == nums[lo + 1]) lo++;
                        while (lo < hi && nums[hi] == nums[hi - 1]) hi--;
                        lo++;
                        hi--;
                    } else if (nums[lo] + nums[hi] < sum) lo++;
                    else hi--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        threeSum2(new int[]{-1, 0, 1, 2, -1, -4});
    }
}
