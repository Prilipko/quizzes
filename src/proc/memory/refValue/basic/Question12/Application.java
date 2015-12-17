package proc.memory.refValue.basic.Question12;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 21.08.13
 * Time: 11:00
 * To change this template use File | Settings | File Templates.
 */
//Что напечатает данная программа при запуске?

public class Application {
    public static void main(String[] args) {
        String[] x = {"A"};
        String[] y = new String[] {x[0]};
        x[0] = "B";
        System.out.print(x[0] + " " + y[0]);
    }
}
//B A