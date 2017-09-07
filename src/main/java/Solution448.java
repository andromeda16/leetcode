import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 6/22/2017.
 */
public class Solution448 {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();

        if (nums == null || nums.length == 0) {
            return list;
        }

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int j = Math.abs(nums[i]) - 1;
            if (nums[j] >= 0) {
                nums[j] = - nums[j];
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                list.add(i + 1);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
    }
}
