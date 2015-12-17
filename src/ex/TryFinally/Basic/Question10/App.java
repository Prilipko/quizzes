package ex.TryFinally.Basic.Question10;

//Что произойдет при попытке cкомпилировать и запустить этот класс?

public class App {
    public static void main(String[] args) {
        System.err.println(f());
    }
    public static int f() {
        try {
            throw new Error();
        } finally {
            throw new RuntimeException();
        }
        //System.err.println(0);//!!!
    }
}
//>A.	не скомпилируется
//B.	0
//C.	Error
//D.	0 Error
//E.	RuntimeException
//F.	0 RuntimeException