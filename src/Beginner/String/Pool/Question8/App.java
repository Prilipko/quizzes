package Beginner.String.Pool.Question8;

//Что выведет данная программа на консоль?

public class App {
    public static void main(String[] args) {
        String str0 = "Hello!";
        String str1 = new String("Hello!").intern();
        System.out.println(str0 == str1);
    }
}
//A.	false
//>B.	true