import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 6/13/2017.
 */
public class Solution119 {

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> l = new ArrayList();

        if (rowIndex < 0) {
            return l;
        }

        for (int i = 0; i <= rowIndex; i++) {
            l.add(1);
            for (int j = i - 1; j > 0; j--) {
                l.set(j, l.get(j - 1) + l.get(j));
            }
        }

        return l;
    }

    public static void main(String[] args) {
        getRow(4);
    }
}
