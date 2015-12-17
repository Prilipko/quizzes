package IO.ClassesClassification.EasyLevel;

import java.io.*;
import java.nio.file.Files;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 20.11.13
 * Time: 17:22
 * To change this template use File | Settings | File Templates.
 */
public class FileReaderTest {
    public static void main(String[] args) {
        System.out.println(new File(".").getAbsolutePath());
        try (FileReader fileReader = new FileReader("resource/text.txt");
        Reader reader = fileReader){
            int someChar;

            while (-1 != (someChar = reader.read())) {
                System.out.print((char) someChar);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
