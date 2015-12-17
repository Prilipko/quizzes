package ex.TryCatchThrows.Basic.Question09;

public class Application {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (Exception e) {
            // nothing
        }
    }
}

//A.	не скомпилируется
//B.	скомпилируется и выбросит исключение
//>C.	скомпилируется и НЕ выбросит исключение