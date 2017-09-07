/**
 * Created by Administrator on 6/19/2017.
 */
public class Solution189 {

    public static void rotate(int[] nums, int k) {
        if (nums.length == 1) return;

        int g = gcd(nums.length, k);
        for (int i = 0; i < g; i++) {
            int j = i, tmp = nums[i];
            do {
                j = (j + k) % nums.length;
                int tmp2 = nums[j];
                nums[j] = tmp;
                tmp = tmp2;
            } while (j != i);
        }
    }


    public static int gcd(int a, int b) {
        if (a == 0 || b == 0) return 1;
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        rotate(new int[] {1,2,3,4,5,6,7}, 0);
    }
}
