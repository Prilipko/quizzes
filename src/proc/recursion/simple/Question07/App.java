package proc.recursion.simple.Question07;

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
            f(2 * n);
        }
        System.out.print(n);
    }
}
//A.	1248
//>B.	8421
//C.	124
//D.	421