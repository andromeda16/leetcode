/**
 * Created by Administrator on 6/14/2017.
 */
public class Solution200 {

    public static int numIslands(char[][] grid) {
        if (grid.length == 0) {
            return 0;
        }

        int c = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1){
                    c++;
                }
            }
        }

        return c;
    }

    public static void main(String[] args) {
        numIslands(new char[][] {});
    }
}
