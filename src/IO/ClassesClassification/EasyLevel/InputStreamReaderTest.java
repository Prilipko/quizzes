package IO.ClassesClassification.EasyLevel;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 08.11.13
 * Time: 12:13
 * To change this template use File | Settings | File Templates.
 */
public class InputStreamReaderTest {
    static String string = "Съешь же ещё этих мягких французских булок, да выпей чаю.";
    public static void main(String[] args) {


//        for(Charset charset: Charset.availableCharsets().values()){
//            System.out.println(charset.name());
//        }
//        System.out.println("Charset.defaultCharset(): " + Charset.defaultCharset().name());

        byte[] bytes = string.getBytes(Charset.forName("UTF-8"));
        System.out.println(string);
        System.out.println("string.length(): " + string.length());
        System.out.println(Arrays.toString(bytes));
        System.out.println("bytes.length: " + bytes.length);
        try ( Reader reader = new InputStreamReader(new ByteArrayInputStream(bytes),Charset.forName("UTF-8"))){
            System.out.println("reader.markSupported();"+reader.markSupported());
            char[] chars = new char[255];
            int countChar = reader.read(chars);
            System.out.println( Arrays.toString(chars));
            System.out.println(new String(chars,0,countChar));
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
