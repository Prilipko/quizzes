package ex.MorePreciseRethow.Mid.Question07;

//Если попробовать скомпилировать и запустить данный пример кода, то

public class App {
    public static void main(String[] args) throws Throwable {
        try {
            Throwable e = new RuntimeException();
            throw e;
        } catch (RuntimeException e) {
            System.err.println(0);
        } catch (Exception e) {
            System.err.println(1);
        }
    }
}
//A.	не скомпилируется`
//>B.	0
//C.	1
//D.	"вылетит" RuntimeException
//E.	"вылетит" Exception
//F.	"вылетит" Throwable