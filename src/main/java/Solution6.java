import org.junit.Assert;

/**
 * Created by Administrator on 5/30/2017.
 */
public class Solution6 {

    public static String convert(String s, int numRows) {
        if (s.isEmpty() || numRows == 1) {
            return s;
        }

        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder("");
        }
        int len = s.length();

        int i = 0;
        while (i < len) {
            for (int j = 0; j < numRows && i < len; j++) {
                sb[j].append(s.charAt(i));
                i++;
            }
            for (int j = numRows - 2; j >= 1 && i < len; j--) {
                sb[j].append(s.charAt(i));
                i++;
            }
        }

        for (i = 1; i < sb.length; i++) {
            sb[0].append(sb[i].toString());
        }
        return sb[0].toString();
    }

    public static void main(String[] args) {
        Assert.assertEquals("PAYPALISHIRING", convert("PAYPALISHIRING", 1));
        Assert.assertEquals("PYAIHRNAPLSIIG", convert("PAYPALISHIRING", 2));
        Assert.assertEquals("PAHNAPLSIIGYIR", convert("PAYPALISHIRING", 3));
        Assert.assertEquals("PINALSIGYAHRPI", convert("PAYPALISHIRING", 4));
        Assert.assertEquals("PHASIYIRPLIGAN", convert("PAYPALISHIRING", 5));
        Assert.assertEquals("PRAIIYHNPSGAIL", convert("PAYPALISHIRING", 6));
    }
}
