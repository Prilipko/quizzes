package IO.Stream.TypeConsistency.Mid;

import java.io.*;
import java.util.zip.GZIPInputStream;

public class App {
    // !!! В тесте множество ошибок. Именно в тесте а не в ответах
    public static void main(String[] args) throws IOException {
        ByteArrayInputStream bais= new ByteArrayInputStream(new byte[0]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(0);


        Writer writer = new StringWriter();

        new GZIPInputStream(new GZIPInputStream(bais));

        new GZIPInputStream(new GZIPInputStream(bais));
        new GZIPInputStream(new DataInputStream(bais));
        InputStream ref = bais; new GZIPInputStream(ref);
        InputStream ref2 = new GZIPInputStream(bais);
//        new BufferedReader(new InputStreamReader())
//        DataInputStream
//        ObjectInputStream
//        FileWriter
//        new OutputStreamWriter()
//        DataInput
        	new DataInputStream(new BufferedInputStream(bais));
        	InputStream ref3 = bais; new DataInputStream(ref3);
        	InputStream ref4 = new DataInputStream(bais);
        	DataInput ref5 = new DataInputStream(bais);
//        new FileReader()
        new BufferedOutputStream(new DataOutputStream(baos));
    }
}
