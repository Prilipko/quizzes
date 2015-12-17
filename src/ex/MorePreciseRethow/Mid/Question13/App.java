package ex.MorePreciseRethow.Mid.Question13;

//Если попробовать скомпилировать и запустить данный пример кода, то

public class App {
    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (Exception | Error e) {
            throw e;
        }
    }
}
//A.	не скомпилируется
//>B.	"вылетит" NullPointerException
//C.	"вылетит" Exception
//D.	"вылетит" Error
//E.	"вылетит" Throwable