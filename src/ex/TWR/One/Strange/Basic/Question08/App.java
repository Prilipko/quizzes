package ex.TWR.One.Strange.Basic.Question08;

//Что произойдет при попытке скомпилировать и запустить код?

public class App {
    public static void main(String[] args) {
        try (Ok x = new Ok("x")){
            x.close();
        }
    }
}
class Ok implements AutoCloseable {
    private String msg;
    public Ok(String msg) {
        this.msg = msg;
        System.err.println("new:" + msg);
    }
    public void close() {
        System.err.println("close:" + msg);
    }
}
//A.	не компилируется
//B.	ничего
//C.	new:x close:x
//>D.	new:x close:x close:x