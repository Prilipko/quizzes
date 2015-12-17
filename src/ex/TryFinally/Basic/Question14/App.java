package ex.TryFinally.Basic.Question14;

//Что произойдет при попытке cкомпилировать и запустить этот класс?

public class App {
    public static void main(String[] args) {
        System.err.println(f());
    }
    public static int f() {
        try {
            System.err.println(0);
            throw new Error();
        } finally {
            throw new RuntimeException();
        }
    }
}
//A.	не скомпилируется
//B.	0
//C.	Error
//D.	0 Error
//E.	RuntimeException
//>F.	0 RuntimeException