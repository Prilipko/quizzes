package ex.TryFinally.Basic.Question11;

//Что произойдет при попытке cкомпилировать и запустить этот класс?

public class App {
    public static void main(String[] args) {
        System.err.println(f());
    }
    public static int f() {
        try {
            throw new Error();
        } finally {
            return 1;
        }
        //System.err.println(0);//!!!
    }
}
//>A.	не скомпилируется
//B.	0
//C.	1
//D.	0 1
//E.	1 0
//F.	Error
//G.	0 Error
//H.	1 Error
//I.	Error 0
//J.	Error 1