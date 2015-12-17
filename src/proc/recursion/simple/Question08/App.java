package proc.recursion.simple.Question08;

/**
 * Created with IntelliJ IDEA.
 * User: worker
 * Date: 21.08.13
 * Time: 20:54
 * To change this template use File | Settings | File Templates.
 */
//Что выведет данная программа в консоль?
public class App {
    public static void main(String[] args) {
        f(1);
    }

    private static void f(int n) {
        if (n < 7) {
            System.out.print(n);
            f(2 * n);
        }
    }
}
//>A.	124
//B.	421
//C.	1248
//D.	8421