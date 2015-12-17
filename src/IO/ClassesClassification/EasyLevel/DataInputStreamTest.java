package IO.ClassesClassification.EasyLevel;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 08.11.13
 * Time: 17:27
 * To change this template use File | Settings | File Templates.
 */
public class DataInputStreamTest {
    static byte[] byteArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {

        try (FileInputStream fileInputStream = new FileInputStream("resource/text.txt");
                InputStream inputStream = new ByteArrayInputStream(byteArray)) {
            DataInput dataInput = new DataInputStream(inputStream);
            inputStream.mark(0);
            System.out.println("dataInput.readByte(): " + dataInput.readByte());
            System.out.println("dataInput.readByte(): " + dataInput.readByte());
            inputStream.reset();
            System.out.println("dataInput.readChar(): " + dataInput.readChar());
            System.out.println("dataInput.readChar(): " + dataInput.readChar());
            inputStream.reset();
            System.out.println("dataInput.readBoolean(): " + dataInput.readBoolean());
            System.out.println("dataInput.readBoolean(): " + dataInput.readBoolean());
            inputStream.reset();
            System.out.println("dataInput.readShort(): " + dataInput.readShort());
            System.out.println("dataInput.readShort(): " + dataInput.readShort());
            inputStream.reset();
            System.out.println("dataInput.readInt(): " + dataInput.readInt());
            System.out.println("dataInput.readInt(): " + dataInput.readInt());
            inputStream.reset();
            System.out.println("dataInput.readLong(): " + dataInput.readLong());
            System.out.println("dataInput.readLong(): " + dataInput.readLong());
            inputStream.reset();
            System.out.println("dataInput.readFloat(): " + dataInput.readFloat());
            System.out.println("dataInput.readFloat(): " + dataInput.readFloat());
            inputStream.reset();
            System.out.println("dataInput.readDouble(): " + dataInput.readDouble());
            System.out.println("dataInput.readDouble(): " + dataInput.readDouble());


            DataInput dataInputF = new DataInputStream(fileInputStream);
            String s;
            while(null != (s = dataInputF.readLine())){ //no UTF
                System.out.println(s);
            }
            /* readUTF() is not work, it need starts 2 bytes of size */
//            System.out.println("dataInput.readUTF(): " + dataInputF.readUTF());
//            System.out.println("dataInput.readUTF(): " + dataInputF.readUTF());
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }


    }
}
