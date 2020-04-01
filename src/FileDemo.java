import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void filefv() {
        File file = new File("C:\\Users\\Yin\\Desktop\\xiaodi\\images\\17.jpg\\imooc");
        //System.out.print(file.exists());
        if (!file.exists())
            file.mkdir();
        else
            file.delete();
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());

        File file2 = new File("C:\\Users\\Yin\\Desktop\\xiaodi\\images\\pp.jpg");
        if (file2.exists())
          try {
              file2.createNewFile();
          } catch (IOException e) {
              e.printStackTrace();
          }
        else
            file2.delete();
        System.out.println(file);
        System.out.println(file.getName());


    }
}


