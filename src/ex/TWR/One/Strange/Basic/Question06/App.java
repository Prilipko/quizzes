package ex.TWR.One.Strange.Basic.Question06;

//Что произойдет при попытке скомпилировать и запустить код?

public class App {
    public static void main(String[] args) {
        Ok x = new Ok("x");
        try (Ok y = x) {
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
//>B.	new: x close: x
//Оказывается рессурс можно выделить раньше, и даже закрыть.
//Трай просто следит чтобы закрылось и сохраняет исключения если таковые были.