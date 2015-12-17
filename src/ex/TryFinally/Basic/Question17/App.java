package ex.TryFinally.Basic.Question17;

//Что произойдет при попытке cкомпилировать и запустить этот класс?

public class App {
    public static void main(String[] args) {
        System.err.println(f());
    }
    public static int f() {
        try {
            System.err.println(0);
        } finally {
            throw new Error();
        }
    }
}
//A.	не скомпилируется
//B.	0
//C.	Error
//D.	Error 0
//>E.	0 Error