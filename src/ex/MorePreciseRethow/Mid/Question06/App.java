package ex.MorePreciseRethow.Mid.Question06;

//Если попробовать скомпилировать и запустить данный пример кода, то

public class App {
    public static void main(String[] args) {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw e;
        }
    }
}
//A.	не скомпилируется
//>B.	"вылетит" Error //переброс из кеча как бы прозрачен
//C.	"вылетит" Throwable