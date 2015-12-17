package proc.recursion.fibonacci.Question04;

/**
 * Created with IntelliJ IDEA.
 * User: worker
 * Date: 21.08.13
 * Time: 21:29
 * To change this template use File | Settings | File Templates.
 */
//Что выведет данная программа в консоль?

public class App {
    public static void main(String[] args) {
        f(3);
    }

    private static int f(int n) {
        int result;
        if (n == 0 || n == 1) {
            result = n;
        } else {
            result = f(n - 2) + f(n - 1);
        }
        System.out.print(n);
        return result;
    }
}
//>A.	10123
//B.	31201
//C.	32101
//D.	10213