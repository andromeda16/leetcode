import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by Administrator on 5/29/2017.
 */
public class Solution20 {
    public static boolean isValid(String s) {
        Stack<Character> myStack = new Stack();
        HashMap<Character, Character> br = new HashMap();
        br.put('(', ')');
        br.put('{', '}');
        br.put('[', ']');

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (br.containsKey(c)) {
                myStack.push(br.get(c));
            } else if (myStack.isEmpty() || myStack.pop() != c) {
                return false;
            }
        }

        return myStack.isEmpty();
    }

    public static void main(String[] args) {
        HashMap<String, Boolean> cases = new HashMap();
        cases.put("", true);
        cases.put("[]", true);
        cases.put("()", true);
        cases.put("{}", true);
        cases.put("{[()]}", true);
        cases.put("{[)]}", false);
        cases.put("{[()}", false);
        cases.put("{", false);


        for (Map.Entry<String, Boolean> c : cases.entrySet()) {
            Assert.assertEquals(String.format("String '%s' should be %s", c.getKey(), c.getValue()), c.getValue(), isValid(c.getKey()));
        }
    }
}