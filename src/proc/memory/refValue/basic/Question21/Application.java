package proc.memory.refValue.basic.Question21;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 21.08.13
 * Time: 11:11
 * To change this template use File | Settings | File Templates.
 */
//Что напечатает данная программа при запуске?

public class Application {
    public static void main(String[] args) {
        String x = "A";
        String y = x;
        y = "B";
        System.out.print(x + " " + y);
    }
}
//A B