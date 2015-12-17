package ex.MorePreciseRethow.Mid.Question12;

//Если попробовать скомпилировать и запустить данный пример кода, то

public class App {
    public static void main(String[] args) throws Throwable {
        Throwable e = new Exception();
        throw e;
    }
}
//A.	не скомпилируется
//>B.	выбросит Exception
//C.	выбросит Throwable