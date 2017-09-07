import org.junit.Assert;

import java.util.Stack;

/**
 * Created by Administrator on 6/2/2017.
 */
public class Solution138 {

    public static int lengthLongestPath(String input) {
        if (input.isEmpty()) {
            return 0;
        }

        int maxLen = 0;
        String[] subDirs = input.split("\n");
        Stack<Integer> stackLen = new Stack();
        stackLen.push(0);

        for (int i = 0; i < subDirs.length; i++) {
            int level = subDirs[i].lastIndexOf("\t") + 1;
            String str = subDirs[i].replace("\t", "");
            if (!str.contains(".")) {
                str += "/";
            }

            while (level + 1 < stackLen.size()) {
                stackLen.pop();
            }

            int len = stackLen.peek() + str.length();
            stackLen.push(len);

            if (str.contains(".") && len > maxLen) {
                maxLen = len;
            }
        }


        return maxLen;
    }

    public static void main(String[] args) {
        String str = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
        String expStr = "dir/subdir2/subsubdir2/file2.ext";
        Assert.assertEquals(expStr.length(), lengthLongestPath(str));
    }
}
