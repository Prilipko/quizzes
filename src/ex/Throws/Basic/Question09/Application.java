package ex.Throws.Basic.Question09;

//Что произойдет при попытке cкомпилировать этот класс?

public class Application {
    public static void main(String[] args) {
        g();
    }

    public static void g() throws Error {
    }
}
//A.	Ошибка времени компиляции
//>B.	Успешно cкомпилируется