import org.junit.Assert;

import java.util.HashMap;

/**
 * Created by Administrator on 6/2/2017.
 */
public class Solution13 {

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                num += map.get(ch);
            } else {
                return -1;
            }
        }

        if (s.indexOf("IV") != -1) {
            num -= 2;
        }
        if (s.indexOf("IX") != -1) {
            num -= 2;
        }
        if (s.indexOf("XL") != -1) {
            num -= 20;
        }
        if (s.indexOf("XC") != -1) {
            num -= 20;
        }
        if (s.indexOf("CD") != -1) {
            num -= 200;
        }
        if (s.indexOf("CM") != -1) {
            num -= 200;
        }

        return num;
    }

    public static void main(String[] args) {
        Assert.assertEquals(1996, romanToInt("MCMXCVI"));
    }
}
