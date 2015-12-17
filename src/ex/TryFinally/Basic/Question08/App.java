package ex.TryFinally.Basic.Question08;

//Что произойдет при попытке cкомпилировать и запустить этот класс?

public class App {
    public static void main(String[] args) {
        System.err.println(f());
    }
    public static int f() {
        try {
            System.err.println(0);
        } finally {
            System.err.println(1);
        }
        return 0;
    }
}
//A.	не скомпилируется
//B.	0
//C.	1
//D.	0 1
//E.	1 0
//>F.	0 1 0
//G.	1 0 1