package proc.recursion.fibonacci.Question01;

/**
 * Created with IntelliJ IDEA.
 * User: worker
 * Date: 21.08.13
 * Time: 21:11
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
            return f(n - 2) + f(n - 1);
        }
    }
}
//A.	10213
//B.	32101
//>C.	31201
//D.	10123