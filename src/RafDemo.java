import java.io.File;

public class RafDemo {
    public static void ratlike(){
        File demo=new File("demo");
        if(!demo.exists())
            demo.mkdir();
    }
}
