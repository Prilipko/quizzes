package ex.MorePreciseRethow.Mid.Question05;

//Если попробовать скомпилировать и запустить данный пример кода, то

//public class App {
//    public static void main(String[] args) {
//        try {
//            Throwable e = new RuntimeException();
//            throw e;
//        } catch (RuntimeException e) {
//            System.err.println(0);
//        } catch (Exception e) {
//            System.err.println(1);
//        }
//    }
//}
//>A.	не скомпилируется //компилятор не знает что кинется именно рантайм. и требует зачекить сровэйбел
//B.	0
//C.	1
//D.	"вылетит" RuntimeException
//E.	"вылетит" Exception
//F.	"вылетит" Throwable