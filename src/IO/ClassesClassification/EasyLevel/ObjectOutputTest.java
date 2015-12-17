package IO.ClassesClassification.EasyLevel;

import java.io.*;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 11.11.13
 * Time: 11:58
 * To change this template use File | Settings | File Templates.
 */
public class ObjectOutputTest {
    static class ParentClass implements Serializable {
        String name;
        int age;

        @Override
        public String toString() {
            String result = "";
            result += "name: " + name + "\n";
            result += "age: " + age + "\n";
            return result;
        }

        ParentClass(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    static class ChildrenClass extends ParentClass {
        char sex;

        @Override
        public String toString() {
            String result = super.toString();
            result += "sex: " + sex + "\n";
            return result;
        }

        ChildrenClass(String name, int age, char sex) {
            super(name, age);
            this.sex = sex;
        }
    }

    /**
     * Сериализация интересная штука. Из эксперементов стало ясно что не стоит прерывать или сбрасывать поток,
     * сериализация помнит что она записала и не записывает имеющиеся данные повтрно.
     * Из следующего эклемпляра будут взяты только данные, без имён классов.
     *
     * @param args
     */
    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass("Vera",32);
        ParentClass cC= new ChildrenClass("Nada",23,'f');


        byte[] out = null;

        try( ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ObjectOutput objectOutput = new ObjectOutputStream(outputStream)){

            System.out.println(cC);
            objectOutput.writeObject((ChildrenClass)cC);

            objectOutput.flush();
            System.out.println(Arrays.toString(outputStream.toByteArray()));
            System.out.println(outputStream.toString("UTF-8"));

            System.out.println(parentClass);
            objectOutput.writeObject(parentClass);

            objectOutput.flush();
            System.out.println(Arrays.toString(outputStream.toByteArray()));
            System.out.println(outputStream.toString("UTF-8"));

            out = outputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        System.out.println();
        try(ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(out);
        ObjectInput objectInput = new ObjectInputStream(byteArrayInputStream)){
            ParentClass readC = (ParentClass)objectInput.readObject();
            System.out.println(readC);
            ParentClass readP = (ParentClass)objectInput.readObject();
            System.out.println(readP);
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (ClassNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }


    }
}
