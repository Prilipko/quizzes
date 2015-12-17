package IO.ClassesClassification.EasyLevel;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 20.11.13
 * Time: 14:37
 * To change this template use File | Settings | File Templates.
 */
public class StringWriterTest {
    public static void main(String[] args) {
        try(StringWriter stringWriter = new StringWriter(4);
        Writer writer = stringWriter ){
            writer.append('a');
            writer.append('b');
            writer.append('c');
            writer.append('d');
            writer.append('e');
            writer.append('f');
            writer.flush();
            System.out.println(writer.toString());
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
