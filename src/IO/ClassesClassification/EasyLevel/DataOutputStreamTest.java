package IO.ClassesClassification.EasyLevel;

import java.io.*;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: worker
 * Date: 09.11.13
 * Time: 13:19
 * To change this template use File | Settings | File Templates.
 */
public class DataOutputStreamTest {
    public static void main(String[] args) {
        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            DataOutput dataOutput = new DataOutputStream(outputStream);

            dataOutput.writeByte(85);
            resetStream(outputStream);

            dataOutput.writeShort(16000);
            resetStream(outputStream);

            dataOutput.writeInt(1600000);
            resetStream(outputStream);

            dataOutput.writeLong(160000000);
            resetStream(outputStream);

            dataOutput.writeBoolean(false);
            resetStream(outputStream);

            dataOutput.writeChar('Ё');
            resetStream(outputStream);

            dataOutput.writeFloat((float) 1.23456);
            resetStream(outputStream);

            dataOutput.writeDouble(1.23456789123456789E-13);
            resetStream(outputStream);

            dataOutput.writeUTF("Бла бла бла"); //2 first bytes are size in bytes
            resetStream(outputStream);

        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

    }

    private static void resetStream(ByteArrayOutputStream outputStream) throws IOException {
        outputStream.flush();
        System.out.println(Arrays.toString(outputStream.toByteArray()));
        outputStream.reset();
    }
}
