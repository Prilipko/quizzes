package IO.ClassesClassification.EasyLevel;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 21.11.13
 * Time: 13:52
 * To change this template use File | Settings | File Templates.
 */
public class FileInputStreamTest {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("resource/text.txt");
        InputStream inputStream = fileInputStream;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"UTF-8")) {
            int someChar;
//            while (-1 != (someChar = inputStream.read())) {
//                System.out.println(someChar);
//            }
            while (-1 != (someChar = inputStreamReader.read())) {
                System.out.print(Character.toChars(someChar));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
