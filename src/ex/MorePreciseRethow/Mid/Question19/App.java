package ex.MorePreciseRethow.Mid.Question19;

//Если попробовать скомпилировать и запустить данный пример кода, то

public class App {
    public static void main(String[] args) throws Throwable {
        Throwable e = new Error();
        throw e;
    }
}
//A.	не скомпилируется
//>B.	"вылетит" Error
//C.	"вылетит" Throwable