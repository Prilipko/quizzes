package IO.ClassesClassification.EasyLevel;


import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 21.11.13
 * Time: 12:44
 * To change this template use File | Settings | File Templates.
 */
public class FileWriteTest {
    public static String newLine = System.getProperty("line.separator");
    public static void main(String[] args) {

        try (FileWriter fileWriter = new FileWriter("resource/tmp.txt", false);
             Writer writer = fileWriter) {
            System.out.println(fileWriter.getEncoding());
            writer.write("Hello!");
            writer.append(newLine);
            writer.append("dubadu");
            writer.append(newLine);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
