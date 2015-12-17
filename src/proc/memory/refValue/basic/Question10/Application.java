package proc.memory.refValue.basic.Question10;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 21.08.13
 * Time: 10:54
 * To change this template use File | Settings | File Templates.
 */
//Что напечатает данная программа при запуске?

public class Application {
    public static void main(String[] args) {
        int[] x = {0};
        int[] y = x;
        y = new int[]{1};
        System.out.print(x[0] + " " + y[0]);
    }
}
//0 1