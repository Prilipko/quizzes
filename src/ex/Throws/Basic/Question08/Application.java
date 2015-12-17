package ex.Throws.Basic.Question08;

//Что произойдет при попытке cкомпилировать этот класс?

public class Application {
    public static void main(String[] args) throws Throwable {
        g();
    }

    public static void g() throws RuntimeException {
    }
}
//A.	Ошибка времени компиляции
//B.	Успешно cкомпилируется