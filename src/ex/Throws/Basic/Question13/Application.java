package ex.Throws.Basic.Question13;

//Что произойдет при попытке cкомпилировать этот класс?

public class Application {
    public static void main(String[] args) throws Error {
        g();
    }

    public static void g() throws RuntimeException {
    }
}
//A.	Ошибка времени компиляции
//>B.	Успешно cкомпилируется