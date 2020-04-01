import java.io.UnsupportedEncodingException;

public class InsertDemo {
    public static void stugtu() throws UnsupportedEncodingException {
        String s = "慕课ABC";
        byte[] bytes1 = s.getBytes();
        for (byte b : bytes1) {
            System.out.print(Integer.toHexString(b & 0xff) + " ");

        }
        System.out.println();
        byte[] bytes2 = s.getBytes("gbk");
        for (byte b : bytes2) {
            System.out.print(Integer.toHexString(b & 0xff) + " ");
        }
        System.out.println();
        byte[] bytes3 = s.getBytes("utf-8");
        for (byte b : bytes3) {
            System.out.print(Integer.toHexString(b & 0xff) + " ");
        }
        System.out.println();
        byte[] bytes4 = s.getBytes("utf-16be");
        for (byte b : bytes4) {
            System.out.print(Integer.toHexString(b & 0xff) + "  ");
        }
    }
}

