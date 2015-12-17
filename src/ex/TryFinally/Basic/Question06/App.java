package ex.TryFinally.Basic.Question06;

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
            System.err.println(1);
            throw new RuntimeException();
        }
    }
}
//A.	не скомпилируется
//B.	Error
//C.	0 Error
//D.	1 Error
//E.	0 1 Error
//F.	1 0 Error
//G.	RuntimeException
//H.	0 RuntimeException
//I.	1 RuntimeException
//>J.	0 1 RuntimeException