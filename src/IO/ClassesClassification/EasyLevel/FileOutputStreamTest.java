package IO.ClassesClassification.EasyLevel;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 21.11.13
 * Time: 14:11
 * To change this template use File | Settings | File Templates.
 */
public class FileOutputStreamTest {
    public static void main(String[] args) {
        try(FileOutputStream fileOutputStream = new FileOutputStream("resource/tmp.txt",false);
        OutputStream outputStream = fileOutputStream;
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream,"UTF-32")){
            outputStreamWriter.append("Привет Медвед!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
