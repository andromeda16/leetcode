/**
 * Created by Administrator on 7/27/2017.
 */
public class UpgradeInterview {

    private static Integer sumOfNumbers1(String str) {
        String[] split = str.split("[A-Za-z]");
        int sum = 0;
        for (String s : split) {
            if (!s.isEmpty()) {
                sum += Integer.valueOf(s);
            }
        }
        return sum;
    }

    private static Integer sumOfNumbers2(String str) {
        char[] chs = str.toCharArray();
        int sum = 0;
        boolean prevIsDigit = false;
        for (int i = 0, j = 0; j < chs.length; j++) {
            boolean currIsDigit = Character.isDigit(chs[j]);
            if (!prevIsDigit && currIsDigit) {
                i = j;
            }
            if (prevIsDigit && !currIsDigit) {
                sum += Integer.valueOf(str.substring(i, j));
            }
            if ((prevIsDigit || currIsDigit) && j == chs.length - 1) {
                sum += Integer.valueOf(str.substring(i, j + 1));
            }
            prevIsDigit = currIsDigit;
        }
        return sum;
    }

    public static void main(String[] args) {
        String str = "abc123xyz05";
        System.out.println(sumOfNumbers1(str));
        System.out.println(sumOfNumbers2(str));
    }
}
