package ex.TWR.One.Strange.Basic.Question05;

//Что произойдет при попытке скомпилировать и запустить код?

//public class App {
//    public static void main(String[] args) {
//        try (Ok x = new Ok("x")) {
//            x = null;
//        }
//    }
//}
//class Ok implements AutoCloseable {
//    private String msg;
//    public Ok(String msg) {
//        this.msg = msg;
//        System.err.println("new:" + msg);
//    }
//    public void close() {
//        System.err.println("close:" + msg);
//    }
//}

//>A.	не компилируется //незнаю, трай следит за сохранностью фабрики
//B.	new:x
//C.	new:x ...NullPointerException
//D.	new:x close:x
//E.	new:x close:x ...NullPointerException