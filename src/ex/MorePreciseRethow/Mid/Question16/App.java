package ex.MorePreciseRethow.Mid.Question16;

//Если попробовать скомпилировать и запустить данный пример кода, то

import java.io.IOException;

public class App {
    public static void main(String[] args) throws Throwable {
        Exception e = new IOException();
        throw e;
    }
}
//A.	не скомпилируется
//>B.	"вылетит" IOException
//C.	"вылетит" Exception
//D.	"вылетит" Throwable