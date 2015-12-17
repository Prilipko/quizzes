package ex.TryCatchThrows.Basic.Question17;

public class Application {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (Error e) {
            // nothing
        }
    }
}

//A.	не скомпилируется
//>B.	скомпилируется и выбросит исключение
//C.	скомпилируется и НЕ выбросит исключение