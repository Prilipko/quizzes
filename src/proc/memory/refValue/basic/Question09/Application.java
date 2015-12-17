package proc.memory.refValue.basic.Question09;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 21.08.13
 * Time: 10:53
 * To change this template use File | Settings | File Templates.
 */
//Что напечатает данная программа при запуске?

public class Application {
    public static void main(String[] args) {
        String x = "A";
        String y = x;
        x = "B";
        System.out.print(x + " " + y);
    }
}
//B A