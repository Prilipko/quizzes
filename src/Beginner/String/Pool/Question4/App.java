package Beginner.String.Pool.Question4;

//Что выведет данная программа на консоль?

public class App {
    public static void main(String[] args) {
        String str0 = "Hello!".intern();
        String str1 = new String("Hello!").intern();
        System.out.println(str0 == str1);
    }
}
//A.	false
//>B.	true