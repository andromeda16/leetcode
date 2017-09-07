/**
 * Created by Administrator on 6/2/2017.
 */
public class Test {

    /*
 * Complete the function below.
 */

    static int[] oddNumbers(int l, int r) {
        int[] arr = new int[r-l];
        int n = l % 2 == 1 ? l : l + 1;
        arr[0] = n;
        int i = 0;
        while(n<=r) {
            arr[i] = n;
            System.out.println(n);
            n += 2;
            i++;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = oddNumbers(3, 9);
        for (int i:
             arr) {
            System.out.println(i);
        }
    }
}
