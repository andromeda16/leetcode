import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 6/13/2017.
 */
public class Solution118 {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tr = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    List<Integer> list = tr.get(i - 1);
                    row.add(list.get(j) + list.get(j - 1));
                }
            }
            tr.add(row);
        }

        return tr;
    }

    public static void main(String[] args) {
        generate(4);
    }
}
