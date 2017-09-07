import org.junit.Assert;

/**
 * Created by Administrator on 6/14/2017.
 */
public class Solution67 {

    public static String addBinary(String a, String b) {
        int n = a.length() - 1, m = b.length() - 1, carry = 0;
        if (n == -1 || a == "0") {
            return b;
        }
        if (m == -1 || b == "0") {
            return a;
        }

        StringBuilder c = new StringBuilder();
        while (n >= 0 || m >= 0) {
            int sum = carry;
            if (n >= 0) {
                sum += a.charAt(n--) - '0';
            }
            if (m >= 0) {
                sum += b.charAt(m--) - '0';
            }
            c.append(sum % 2);
            carry = sum / 2;
        }

        if (carry != 0) {
            c.append(carry);
        }

        return c.reverse().toString();
    }

    public static void main(String[] args) {
        Assert.assertEquals("100", addBinary("11", "1"));
    }
}
