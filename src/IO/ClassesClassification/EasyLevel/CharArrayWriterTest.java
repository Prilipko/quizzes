package IO.ClassesClassification.EasyLevel;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 20.11.13
 * Time: 15:53
 * To change this template use File | Settings | File Templates.
 */
public class CharArrayWriterTest {
    public static void main(String[] args) {
        try (CharArrayWriter charArrayWriter = new CharArrayWriter(4);
        Writer writer = charArrayWriter){
            writer.append('a');
            writer.append('b');
            writer.append('c');
            writer.append('d');
            writer.append('e');
            writer.append('f');
            writer.append("\"Вот так вот\"");
            writer.flush();
            System.out.println(writer.toString());
            System.out.println(Arrays.toString(charArrayWriter.toCharArray()));
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
