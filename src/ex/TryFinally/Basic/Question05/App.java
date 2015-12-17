package ex.TryFinally.Basic.Question05;

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
        //System.err.println(1);//ЗАКОММЕНТИРОВАНО МНОЙ
    }
}
//>A.	не скомпилируется
//B.	0
//C.	1
//D.	0 1
//E.	1 0
//F.	Error
//G.	0 Error
//H.	Error 0