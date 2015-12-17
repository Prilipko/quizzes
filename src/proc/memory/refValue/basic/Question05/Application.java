package proc.memory.refValue.basic.Question05;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 21.08.13
 * Time: 10:33
 * To change this template use File | Settings | File Templates.
 */
//    Что напечатает данная программа при запуске?

public class Application {
    public static void main(String[] args) {
        String[] x = {"A"};
        String[] y = x;
        x[0] = "B";
        System.out.print(x[0] + " " + y[0]);
    }
}
//B B
