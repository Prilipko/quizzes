package ex.TryFinally.Basic.Question09;

//Что произойдет при попытке cкомпилировать и запустить этот класс?

public class App {
    public static void main(String[] args) {
        System.err.println(f());
    }
    public static int f() {
        try {
            throw new Error();
        } finally {
            return 0;
        }
    }
}
//A.	не скомпилируется
//>B.	0   //finally бьет всех и ретурн и бросок!!!
//C.	Error
//D.	Error - 0 Error
//E.	Error 0