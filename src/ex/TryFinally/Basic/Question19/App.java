package ex.TryFinally.Basic.Question19;

//Что произойдет при попытке cкомпилировать и запустить этот класс?

public class App {
    public static void main(String[] args) {
        System.err.println(f());
    }
    public static int f() {
        try {
            return 0;
        } finally {
            return 1;
        }
        //return 0;//!!!
    }
}
//>A.	не скомпилируется //компилятор видит что до последнего ретурна дело не дойдёт(итоговый файнали)
//B.	0
//C.	1
//D.	0 1
//E.	1 0