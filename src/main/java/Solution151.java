import org.junit.Assert;

import java.util.List;

/**
 * Created by Administrator on 6/2/2017.
 */
public class Solution151 {
    public static String reverseWords(String s) {
        if (s.isEmpty()) {
            return "";
        }

        String[] strings = s.split("\\s+");
        StringBuilder newS = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            if (!strings[i].isEmpty()) {
                newS.append(strings[i]);
                newS.append(" ");
            }
        }
        return newS.toString().trim();
    }

    public static void main(String[] args) {
        Assert.assertEquals("b a", reverseWords("   a   b "));
    }
}
