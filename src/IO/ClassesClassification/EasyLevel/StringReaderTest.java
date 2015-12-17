package IO.ClassesClassification.EasyLevel;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 20.11.13
 * Time: 14:23
 * To change this template use File | Settings | File Templates.
 */
public class StringReaderTest {
    static String string = "Съешь же ещё этих мягких французских булок, да выпей чаю.";

    public static void main(String[] args) {

        try (StringReader stringReader = new StringReader(string);
             Reader reader = stringReader) {
            int someChar;
            while (-1 != (someChar = reader.read())) {
                System.out.println((char) someChar);
            }
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

    }
}
