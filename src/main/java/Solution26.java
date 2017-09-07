/**
 * Created by Administrator on 6/13/2017.
 */
public class Solution26 {

    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
            return length;
        }

        int l = 1;
        for (int i = 1; i < length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[l++] = nums[i];
            }
        }
        return l;
    }

    public static void main(String[] args) {
        removeDuplicates(new int[]{1, 1, 2, 2, 3});
    }
}
