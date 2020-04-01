import java.io.File;
import java.io.IOException;

public class FileUtils {
    //工具类
    public static void listDirectory(File dir) throws IOException{
        if(!dir.exists()) {
            throw new IllegalArgumentException("目录：" + dir + "不存在.");
            }

        }

    }

