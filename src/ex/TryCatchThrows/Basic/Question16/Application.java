package ex.TryCatchThrows.Basic.Question16;

public class Application {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Throwable t) {
            // nothing
        }
    }
}

//A.	не скомпилируется
//B.	скомпилируется и выбросит исключение
//>C.	скомпилируется и НЕ выбросит исключение