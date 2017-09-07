import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 8/6/2017.
 */
public class HackerRankSDET {

    public static int numberOfPairs(int[] a, long k) {
        Set<Integer> inputSet = new HashSet();
        Set<Integer> resultSet = new HashSet();

        for (int i = 0; i < a.length; i++) {
            int diff = (int) (k - a[i]);
            if (inputSet.contains(diff)) {
                if (!resultSet.contains(diff)) {
                    resultSet.add(a[i]);
                }
            } else {
                inputSet.add(a[i]);
            }
        }
        return resultSet.size();
    }

    public static void main(String[] args) {

    }
}
