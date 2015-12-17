package ex.MorePreciseRethow.Mid.Question11;

//Если попробовать скомпилировать и запустить данный пример кода, то

public class App {
    public static void main(String[] args) throws Exception {
        try {
            throw new Exception();
        } catch (Throwable e) {
            throw e;
        }
    }
}
//A.	не скомпилируется
//>B.	"вылетит" Exception
//C.	"вылетит" Throwable