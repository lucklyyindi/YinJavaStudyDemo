import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsAndosw {
    public static void inputji()throws IOException{
        FileInputStream in=new FileInputStream("C:\\Users\\Yin\\Desktop\\xiaodi\\kio.txt");
        InputStreamReader isr=new InputStreamReader(in);
        /*int c;
        while ((c=isr.read())!=-1){
            System.out.print((char)c);
        }*/
        char[] buffer=new char[8*1024];
        int c;
        while ((c=isr.read(buffer,0,buffer.length))!=-1){
            String s=new String(buffer,0,c);
            System.out.print(s);

        }
    }
}
