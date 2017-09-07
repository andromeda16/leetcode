import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 6/20/2017.
 */
public class Solution195 {

    public static void main(String[] args) throws IOException {
        List<String> lines = FileUtils.readLines(new File("src\\main\\file.txt"));
        System.out.println(lines.get(9));
    }
}
