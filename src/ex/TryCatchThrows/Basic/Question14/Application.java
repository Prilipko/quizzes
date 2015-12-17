package ex.TryCatchThrows.Basic.Question14;

public class Application {
    public static void main(String[] args) throws Throwable {
        try {
            throw new Exception();
        } catch (Error e) {
            // nothing
        }
    }
}

//A.	не скомпилируется
//>B.	скомпилируется и выбросит исключение
//C.	скомпилируется и НЕ выбросит исключение