
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Calculate_md5
{
    //将结果以16进制显示
    private static String bytesToHex(byte[] bByte){
        StringBuffer sb = new StringBuffer();
        for (byte b : bByte){
            String s = Integer.toHexString(b&0xff);
            if (s.length() == 1){
                s ="0" + s;
            }
            sb.append(s);
        }
        return sb.toString();
    }

    public static String GetMD5Code(String strObj) {
        String resultString = null;
        try {
            resultString = new String(strObj);
            MessageDigest md = MessageDigest.getInstance("MD5");
            // md.digest() 该函数返回值为存放哈希值结果的byte数组
            resultString = bytesToHex(md.digest(strObj.getBytes()));

        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        return resultString;
    }
}
