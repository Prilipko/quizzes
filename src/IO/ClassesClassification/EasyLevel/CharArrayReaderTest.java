package IO.ClassesClassification.EasyLevel;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 20.11.13
 * Time: 14:52
 * To change this template use File | Settings | File Templates.
 */
public class CharArrayReaderTest {
    static char[] charArray = {'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!'};

    public static void main(String[] args) {
        try(CharArrayReader charArrayReader = new CharArrayReader(charArray);
        Reader reader = charArrayReader){
            int someChar;
            while (-1 != (someChar = reader.read())) {
                System.out.println((char) someChar);
            }
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

    }
}
