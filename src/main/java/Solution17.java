import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 8/11/2017.
 */
public class Solution17 {

    public static List<String> letterCombinations(String digits) {
        LinkedList<String> res = new LinkedList<String>();

        if (digits == null || digits.isEmpty()) {
            return res;
        }

        res.add("");
        String[] match = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        for (int i = 0; i < digits.length(); i++) {
            int digit = digits.charAt(i) - '0';

            while(res.peek().length() == i) {
                String el = res.pop();
                for (Character ch: match[digit].toCharArray()) {
                    res.add(el + ch);
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        letterCombinations("23");
    }
}
