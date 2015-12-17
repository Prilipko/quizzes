package Beginner.String.Pool.Question1;

//Что выведет данная программа на консоль?

public class App15 {
    public static void main(String[] args) {
        String str0 = new String("Hello!").intern();
        String str1 = new String(str0.intern());
        System.out.println(str0 == str1);
    }
}
//>A.	false
//B.	true