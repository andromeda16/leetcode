import org.junit.Assert;

/**
 * Created by Administrator on 6/13/2017.
 */
public class Solution39 {

    public static String countAndSay(int n) {
        if (n <= 0) {
            return "";
        }

        StringBuilder str = new StringBuilder("1");

        for (int i = 1, count; i < n; i++) {
            StringBuilder prevStr = str;
            str = new StringBuilder();
            char ch = prevStr.charAt(0);
            count = 1;

            for (int j = 1; j < prevStr.length(); j++) {
                if (prevStr.charAt(j - 1) != prevStr.charAt(j)) {
                    str.append(count).append(prevStr.charAt(j - 1));
                    ch = prevStr.charAt(j);
                    count = 1;
                } else {
                    count++;
                }
            }
            str.append(count).append(ch);
        }

        return str.toString();
    }

    public static void main(String[] args) {
        Assert.assertEquals("1", countAndSay(1));
        Assert.assertEquals("11", countAndSay(2));
        Assert.assertEquals("21", countAndSay(3));
        Assert.assertEquals("1211", countAndSay(4));
        Assert.assertEquals("111221", countAndSay(5));
        Assert.assertEquals("13211311123113112211", countAndSay(10));
    }
}
