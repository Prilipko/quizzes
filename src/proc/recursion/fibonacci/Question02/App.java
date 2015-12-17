package proc.recursion.fibonacci.Question02;

/**
 * Created with IntelliJ IDEA.
 * User: worker
 * Date: 21.08.13
 * Time: 21:14
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
            result = f(n - 1) + f(n - 2);
        }
        System.out.print(n);
        return result;
    }
}
//A.	31201
//>B.	10213
//C.	10123
//D.	32101
//Думал C а надо B