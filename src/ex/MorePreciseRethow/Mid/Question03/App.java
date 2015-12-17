package ex.MorePreciseRethow.Mid.Question03;

//Если попробовать скомпилировать и запустить данный пример кода, то

import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            throw new IOException();
        } catch (Throwable e) {
            throw e;
        }
    }
}
//A.	не скомпилируется
//>B.	"вылетит" IOException //кетч ловит но не меняет тип ексепшена, не повышает его при броске дальше
//C.	"вылетит" Exception
//D.	"вылетит" Throwable