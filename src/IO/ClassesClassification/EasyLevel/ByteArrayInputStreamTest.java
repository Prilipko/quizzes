package IO.ClassesClassification.EasyLevel;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 08.11.13
 * Time: 11:35
 * To change this template use File | Settings | File Templates.
 */
public class ByteArrayInputStreamTest {
    static InputStream inputStream;
    static byte[] byteArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        /* ByteArrayInputStream */
        try (InputStream byteArrayInputStream = new ByteArrayInputStream(byteArray)){
            inputStream = byteArrayInputStream;
            System.out.println("inputStream.available(): "+inputStream.available());
            System.out.println("inputStream.markSupported(): "+inputStream.markSupported());
            System.out.println("inputStream.read(): "+inputStream.read());
            inputStream.mark(5);
            System.out.println("inputStream.mark()");
            System.out.println("inputStream.read(): " + inputStream.read());
            System.out.println("inputStream.read(): " + inputStream.read());
            System.out.println("inputStream.read(): " + inputStream.read());
            System.out.println("inputStream.read(): " + inputStream.read());
            System.out.println("inputStream.read(): " + inputStream.read());
            System.out.println("inputStream.read(): "+inputStream.read());
            inputStream.reset();
            System.out.println("inputStream.reset()");
            System.out.println("inputStream.read(): " + inputStream.read());
            System.out.println("inputStream.read(): " + inputStream.read());
            inputStream.reset();
            System.out.println("inputStream.reset()");
            inputStream.skip(2);
            System.out.println("inputStream.skip(2)");
            System.out.println("inputStream.read(): " + inputStream.read());
            System.out.println("inputStream.read(): " + inputStream.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
