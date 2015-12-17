package IO.ClassesClassification.EasyLevel;

import java.io.*;
import java.nio.charset.Charset;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 08.11.13
 * Time: 15:38
 * To change this template use File | Settings | File Templates.
 */
public class OutputStreamWriterTest {
    static char[] charArray = {'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!'};
    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream;
        try(Writer writer = new OutputStreamWriter( byteArrayOutputStream = new ByteArrayOutputStream(), Charset.forName("UTF-8"))){
            writer.write(charArray);
            writer.append(":)");
            writer.flush();
            System.out.println(byteArrayOutputStream.toString("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
