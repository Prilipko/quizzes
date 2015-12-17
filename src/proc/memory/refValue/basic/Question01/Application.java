package proc.memory.refValue.basic.Question01;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 21.08.13
 * Time: 10:23
 * To change this template use File | Settings | File Templates.
 */
//Что напечатает данная программа при запуске?
public class Application {
    public static void main(String[] args) {
        int[] x = {0};
        int[] y = new int[] {x[0]};
        y[0] = 1;
        System.out.print(x[0] + " " + y[0]);
    }
}
//01