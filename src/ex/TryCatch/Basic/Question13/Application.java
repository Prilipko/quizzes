package ex.TryCatch.Basic.Question13;

/**
 * Created with IntelliJ IDEA.
 * User: worker
 * Date: 20.09.13
 * Time: 20:50
 * To change this template use File | Settings | File Templates.
 */
public class Application {
    public static void main(String[] args) throws Throwable {
        try {
            System.out.print("0 ");
            throw new Error();
        } catch (Error e) {
            System.out.print("1 ");
        }
        System.out.print("2 ");
    }
}
//A.	0
//B.	0 1
//>C.	0 1 2
//D.	0 2
