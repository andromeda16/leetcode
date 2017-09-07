import org.junit.Assert;

public class Solution338 {
    public static int[] countBits(int num) {
        int[] arr = new int[num + 1];

        for (int j = 0; j <= num; j++) {
            int i = 0;
            int n = j;
            while (n != 0) {
                n = n & (n - 1);
                i++;
            }
            arr[j] = i;
        }
        return arr;
    }

    public static int[] countBits2(int num) {
        int[] arr = new int[num + 1];

        for (int j = 0; j <= num; j++) {
            arr[j] = arr[j >> 1] + (j & 1);
        }
        return arr;
    }

    public static void main(String[] args) {
        Assert.assertArrayEquals(new int[]{
                0, 1, 1, 2, 1, 2
        }, countBits2(5));
    }
}