import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 6/9/2017.
 */
public class Solution476 {

    public static int findComplement(int num) {
        return ~num & (Integer.highestOneBit(num) - 1);
    }

    public static boolean isPowerOfFour(int num) {
        return ((num - 1) & num) == 0 && ((num & 3) == 0);
    }

    public static char findTheDifference(String s, String t) {
        char[] s2 = s.toCharArray();
        char[] t2 = t.toCharArray();
        int sLength = s2.length;
        char a = t2[0];
        for (int i = 0; i < sLength; i++) {
            a = (char) (a ^ s2[i] ^ t2[i + 1]);
        }
        return a;
    }

    public static int hammingDistance(int x, int y) {
        int i = 0;
        while (x != 0 || y != 0) {
            if ((x & 1) != (y & 1)) {
                i++;
            }
            x >>= 1;
            y >>= 1;
        }
        return i;
    }

    public static String toHex(int num) {
        char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        if (num == 0) {
            return "0";
        }

        String result = "";
        while (num != 0) {
            result = map[(num & 15)] + result;
            num = num >>> 4;
        }
        return result;
    }

    public static int majorityElement(int[] nums) {
        int[] bit = new int[32];
        for (int num : nums)
            for (int i = 0; i < 32; i++)
                if ((num >> (31 - i) & 1) == 1)
                    bit[i]++;

        int ret = 0;
        for (int i = 0; i < 32; i++) {
            bit[i] = bit[i] > nums.length / 2 ? 1 : 0;
            ret += bit[i] * (1 << (31 - i));
        }
        return ret;
    }

    public static int singleNumber(int[] nums) {
        int num = 0;
        for (int i = 0; i < 32; i++) {
            int c = 0;
            for (int n : nums) {
                if (((n >> i) & 1) == 1) {
                    c++;
                    c %= 3;
                }
            }
            if (c != 0) {
                num |= c << i;
            }
        }

        return num;
    }

    public List<String> findRepeatedDnaSequences(String s) {
        Set<Integer> words = new HashSet<Integer>();
        Set<Integer> doubleWords = new HashSet<Integer>();
        List<String> rv = new ArrayList<String>();
        char[] map = new char[26];
        map['A'] = 0;
        map['C'] = 1;
        map['G'] = 2;
        map['T'] = 3;

        for(int i = 0; i < s.length() - 9; i++) {
            int v = 0;
            for(int j = i; j < i + 10; j++) {
                v <<= 2;
                v |= map[s.charAt(j)];
            }
            if(!words.add(v) && doubleWords.add(v)) {
                rv.add(s.substring(i, i + 10));
            }
        }
        return rv;
    }

    public static void main(String[] args) {
//        findComplement(5);
//        isPowerOfFour(4);
//        findTheDifference("abc", "abcd");
//        hammingDistance(1, 4);
//        toHex(26);
//        majorityElement(new int[]{1, 2, 1, 1, 2, 2, 5});

//        singleNumber(new int[]{1, 2, 1, 1, 2, 2, 5});
        singleNumber(new int[]{-2, -2, 1, 1, -3, 1, -3, -3, -4, -2});

    }
}
