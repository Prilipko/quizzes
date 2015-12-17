package proc.memory.refValue.basic.Question14;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 21.08.13
 * Time: 11:02
 * To change this template use File | Settings | File Templates.
 */
//Что напечатает данная программа при запуске?

public class Application {
    public static void main(String[] args) {
        int[] x = {0};
        int[] y = x;
        y[0] = 1;
        System.out.print(x[0] + " " + y[0]);
    }
}
//1 1