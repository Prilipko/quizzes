package IO.ClassesClassification.EasyLevel;

import org.omg.CORBA.portable.*;

import java.io.*;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 21.11.13
 * Time: 14:26
 * To change this template use File | Settings | File Templates.
 */
public class BufferedInputStreamTest {
    public static void main(String[] args) {
        try (InputStream inputStream = new BufferedInputStream(new FileInputStream("resource/avatar.bmp"));
             OutputStream outputStream = new GZIPOutputStream(new FileOutputStream("resource/avatar2.gzip", false),1024 * 8)) {
            int theByte;
            while (-1 != (theByte = inputStream.read())) {
                outputStream.write(theByte);
            }
            outputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        try (InputStream inputStream = new GZIPInputStream(new FileInputStream("resource/avatar.gzip"));
             OutputStream outputStream = new BufferedOutputStream(new FileOutputStream("resource/avatar2.bmp", false),1024 * 8)) {
            int theByte;
            while (-1 != (theByte = inputStream.read())) {
                outputStream.write(theByte);
            }
            outputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

    }
}


