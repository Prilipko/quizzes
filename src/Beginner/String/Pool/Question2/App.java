package Beginner.String.Pool.Question2;

//Что выведет данная программа на консоль?

public class App {
    public static void main(String[] args) {
        String str0 = "Hello!";
        String str1 = new String("Hello!");
        System.out.println(str0 == str1);
    }
}
//>A.	false
//B.	true