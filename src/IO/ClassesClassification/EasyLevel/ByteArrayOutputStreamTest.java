package IO.ClassesClassification.EasyLevel;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 08.11.13
 * Time: 11:37
 * To change this template use File | Settings | File Templates.
 */
public class ByteArrayOutputStreamTest {
    static OutputStream outputStream;

    public static void main(String[] args) {
        /* ByteArrayOutputStream */
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(2)) {
            outputStream = byteArrayOutputStream;

            System.out.println("byteArrayOutputStream.size(): " + byteArrayOutputStream.size());
            outputStream.write(0);
            System.out.println("outputStream.write(0)");
            outputStream.write(1);
            System.out.println("outputStream.write(1)");
            outputStream.write(2);
            System.out.println("outputStream.write(2)");
            System.out.println("byteArrayOutputStream.size(): " + byteArrayOutputStream.size());

            System.out.println(Arrays.toString(byteArrayOutputStream.toByteArray()));
            byteArrayOutputStream.reset();
            System.out.println("byteArrayOutputStream.reset()");
            outputStream.write(3);
            System.out.println("outputStream.write(3)");
            outputStream.write(4);
            System.out.println("outputStream.write(4)");
            System.out.println(Arrays.toString(byteArrayOutputStream.toByteArray()));
            outputStream.flush();
            System.out.println("outputStream.flush()");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();

    }
}
