package proc.recursion.simple.Question02;

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
        System.out.print(n);
    }
}
//A.	24842
//B.	248421
//C.	124842
//D.	124421
//>E.	1248421
//F.	12488421