import java.util.*;

public class Solution496 {
    public static int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] res = new int[findNums.length];
        List<Integer> numsList = new ArrayList<Integer>();
        for (int index = 0; index < nums.length; index++) {
            numsList.add(nums[index]);
        }

        for (int i = 0; i < findNums.length; i++) {
            int k = -1;
            int num = findNums[i];
            for (int j = numsList.indexOf(num); j < numsList.size(); j++) {
                if (numsList.get(j) > num) {
                    k = numsList.get(j);
                    break;
                }
            }
            res[i] = k;
        }
        return res;
    }

    public static int[] nextGreaterElement2(int[] findNums, int[] nums) {
        int[] res = new int[findNums.length];
        Stack<Integer> stack = new Stack();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }
        for (int i = 0; i < findNums.length; i++) {
            res[i] = map.getOrDefault(findNums[i], -1);
        }
        return res;
    }

    public static int searchInsert(int[] nums, int target) {
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            if (nums[i] < target && i + 1 < nums.length && nums[i + 1] > target) {
                x = i + 1;
            }
        }
        return x;
    }

    public static void main(String[] args) {
//        nextGreaterElement2(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2});
        searchInsert(new int[]{1, 3, 5, 6}, 2);
    }
}