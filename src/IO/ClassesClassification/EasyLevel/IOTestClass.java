package IO.ClassesClassification.EasyLevel;

import java.io.*;
import java.util.Arrays;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * <p>Class for testing of functionality java io classes.</p>
 * <p>User: worker</p>
 * <p>Date: 02.11.13</p>
 * <p>Time: 16:45</p>
 * <p>
 * Java IO Classes can be:
 * <lu>
 * <li>byte stream input (
 * {@link InputStream},
 * {@link BufferedInputStream},
 * {@link GZIPInputStream},
 * {@link ByteArrayInputStream},
 * {@link FileInputStream}),</li>
 * <li>byte stream output (
 * {@link OutputStream},
 * {@link BufferedOutputStream},
 * {@link GZIPOutputStream},
 * {@link ByteArrayOutputStream},
 * {@link FileOutputStream}),</li>
 * <li>char stream input (
 * {@link Reader},
 * {@link InputStreamReader},
 * {@link StringReader},
 * {@link CharArrayReader},
 * {@link FileReader}),</li>
 * <li>char stream output (
 * {@link Writer},
 * {@link OutputStreamWriter},
 * {@link StringWriter},
 * {@link CharArrayWriter},
 * {@link FileWriter}),</li>
 * <li>type stream input  (
 * {@link DataInput},
 * {@link DataInputStream}),</li>
 * <li>type stream output (
 * {@link DataOutput},
 * {@link DataOutputStream}),</li>
 * <li>object stream input (
 * {@link ObjectInput},
 * {@link ObjectInputStream}),</li>
 * <li>object stream output (
 * {@link ObjectOutput},
 * {@link ObjectOutputStream}),</li>
 * <li>adapter (
 * {@link InputStreamReader},
 * {@link OutputStreamWriter},
 * {@link DataInputStream},
 * {@link DataOutputStream},
 * {@link StringReader},
 * {@link StringWriter},
 * {@link ByteArrayInputStream},
 * {@link ByteArrayOutputStream},
 * {@link CharArrayReader},
 * {@link CharArrayWriter},
 * {@link FileInputStream},
 * {@link FileOutputStream},
 * {@link FileReader},
 * {@link FileWriter},
 * {@link ObjectOutputStream},
 * {@link ObjectInputStream}),</li>
 * <li>decorator (
 * {@link BufferedInputStream},
 * {@link BufferedOutputStream},
 * {@link GZIPInputStream},
 * {@link GZIPOutputStream }).</li>
 * </lu>
 * </p>
 */
public class IOTestClass {
    static byte[] byteArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    static char[] charArray = {'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!'};
    static String string = "Съешь же ещё этих мягких французских булок, да выпей чаю.";
    static char aChar = 'Ё';
    static boolean aBoolean = false;
    static byte aByte = 36;
    static short aShort = 22_423;
    static int anInt = 44_834_545;
    static long aLong = -1_431_678_234;
    static float aFloat = 1.232_4f;
    static double aDouble = 9.1234567890_1234567890E-200;

    class ParentClass implements Cloneable {
        String name;
        int age;

        ParentClass(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    class ChildrenClass extends ParentClass {
        char sex;

        ChildrenClass(String name, int age, char sex) {
            super(name, age);
            this.sex = sex;
        }
    }

    static InputStream inputStream;
    static OutputStream outputStream;
    static Reader reader;
    static Writer writer;
    static DataInput dataInput;
    static DataOutput dataOutput;
    static ObjectInput objectInput;
    static ObjectOutput objectOutput;

    public static void main(String[] args) {



        try(ByteArrayInputStream byteArrayInputStream  = new ByteArrayInputStream(byteArray);
        InputStreamReader inputStreamReader = new InputStreamReader(byteArrayInputStream)){
            reader = inputStreamReader;
            char[] chars = new char[5];
            reader.read(chars);
        }
        catch (IOException e){
            e.printStackTrace();
         }
    }
}
