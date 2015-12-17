package proc.recursion.fibonacci.Question03;

/**
 * Created with IntelliJ IDEA.
 * User: worker
 * Date: 21.08.13
 * Time: 21:27
 * To change this template use File | Settings | File Templates.
 */
//Что выведет данная программа в консоль?

public class App {
    public static void main(String[] args) {
        f(3);
    }

    private static int f(int n) {
        System.out.print(n);
        if (n == 0 || n == 1) {
            return n;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }
}
//>A.	32101
//B.	10123
//C.	10213
//D.	31201