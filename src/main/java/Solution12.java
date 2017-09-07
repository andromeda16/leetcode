import org.junit.Assert;

import java.util.LinkedHashMap;

/**
 * Created by Administrator on 6/13/2017.
 */
public class Solution12 {

    public static String intToRoman(int num) {
        if (num < 1 || num > 3999) {
            return "";
        }

        LinkedHashMap<Integer, String> map = new LinkedHashMap();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        StringBuilder str = new StringBuilder();
        for (int i : map.keySet()) {
            int d = num / i;
            if (d != 0) {
                String s = map.get(i);
                while (d-- != 0) {
                    str.append(s);
                }
                num -= num / i * i;
            }
            if (num == 0) {
                return str.toString();
            }
        }

        return str.toString();
    }

    public static void main(String[] args) {
        Assert.assertEquals("I", intToRoman(1));
        Assert.assertEquals("II", intToRoman(2));
        Assert.assertEquals("III", intToRoman(3));
        Assert.assertEquals("IV", intToRoman(4));
        Assert.assertEquals("V", intToRoman(5));
        Assert.assertEquals("CXXIII", intToRoman(123));
        Assert.assertEquals("MCMXXVIII", intToRoman(1928));
        Assert.assertEquals("MMMCMXCIX", intToRoman(3999));
    }

}
