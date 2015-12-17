package ex.TWR.One.Strange.Basic.Question04;

//Что произойдет при попытке скомпилировать и запустить код?

//public class App {
//    public static void main(String[] args) {
//        Ok x;
//        try (x = new Ok("x")) {
//            // NOP
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
//>A.	не компилируется
//B.	new:x close:x