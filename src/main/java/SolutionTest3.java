/**
 * Created by Administrator on 6/8/2017.
 */
public class SolutionTest3 {
    static String[] doesCircleExist(String[] commands) {
        String[] result = new String[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int x = 0, y = 0, dir = 0;
            for (char c : commands[i].toCharArray()) {
                switch (c) {
                    case 'G':
                        switch (dir) {
                            case 0:
                                y++;
                                break;
                            case 1:
                                x++;
                                break;
                            case 2:
                                y--;
                                break;
                            case 3:
                                x--;
                                break;
                        }
                        break;
                    case 'L':
                        dir = Math.abs((dir - 1) % 4);
                        break;
                    case 'R':
                        dir = Math.abs((dir + 1) % 4);
                        break;
                }
            }
            if (x == 0 && y == 0) {
                result[i] = "YES";
            } else {
                result[i] = "NO";
            }
        }
        return result;
    }
}
