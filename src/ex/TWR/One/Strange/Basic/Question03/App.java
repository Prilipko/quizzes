package ex.TWR.One.Strange.Basic.Question03;

//Что произойдет при попытке скомпилировать и запустить код?

//public class App {
//    public static void main(String[] args) {
//        try (Ok x = new Ok("x")){
//            // NOP
//        } finally {
//            x.close();
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

//>A.	не компилируется //x вне области видимости
//B.	new:x close:x
//C.	new:x close:x close:x