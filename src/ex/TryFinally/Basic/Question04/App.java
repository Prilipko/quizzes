package ex.TryFinally.Basic.Question04;

//Что произойдет при попытке cкомпилировать и запустить этот класс?

public class App {
    public static void main(String[] args) {
        System.err.println(f());
    }
    public static int f() {
        try {
            return 0;
        } finally {
            throw new Error();
        }
    }
}
//A.	не скомпилируется
//B.	0
//>C.	Error
//D.	0 Error
//E.	Error 0