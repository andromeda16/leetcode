import org.junit.Assert;

import java.util.HashMap;

class Solution {
    private static int solution(int[] A) {
        if (A == null || A.length == 0) {
            return -1;
        }

        if (A.length == 1) {
            return 0;
        }

        int n = A.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int a = A[i];
            if (map.containsKey(a)) {
                Integer count = map.get(a);
                count++;
                map.put(a, count);
                if (count * 2 > n) {
                    return i;
                }
            } else {
                map.put(a, 1);
            }
        }
        return -1;
    }

    public int solution2(int[] A) {
        if (A == null || A.length == 0) {
            return -1;
        }

        if (A.length == 1) {
            return 0;
        }

        int leader = 0, counter = 0;
        for (int i = 0; i < A.length; i++) {
            if (counter == 0) {
                leader = i;
                counter++;
            } else if (A[i] == A[leader]) {
                counter++;
            } else {
                counter--;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        Assert.assertEquals(6, solution(new int[] {3, 4, 3, 2, 3, -1, 3, 3}));
    }
}