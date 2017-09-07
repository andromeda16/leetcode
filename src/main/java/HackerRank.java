import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 6/16/2017.
 */
public class HackerRank {

    static void Main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> stack = new LinkedList<Integer>();

        while (sc.hasNextLine()) {
            String command = sc.nextLine();
            String[] split = command.split("\\s+");

            if (split[0] == "push") {
                Integer number = Integer.valueOf(split[1]);
                stack.add(number);
            } else if (split[0] == "pop" && stack.size() > 0) {
                stack.remove(0);
            } else if (split[0] == "inc") {
                Integer count = Integer.valueOf(split[1]);
                Integer increment = Integer.valueOf(split[2]);
                count = Math.min(stack.size(), count);
                int l = stack.size() - 1;

                for (int j = 0; j < count; ++j) {
                    stack.set(l - j, stack.get(l - j) + increment);
                }
            }

            printTop(stack);
        }
    }

    static void printTop(List<Integer> stack) {
        if (stack.size() == 0) {
            System.out.println("EMPTY");
        } else {
            System.out.println(stack.get(0).toString());
        }
    }
}
