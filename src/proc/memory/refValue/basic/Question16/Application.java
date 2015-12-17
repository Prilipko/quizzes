package proc.memory.refValue.basic.Question16;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 21.08.13
 * Time: 11:05
 * To change this template use File | Settings | File Templates.
 */
//Что напечатает данная программа при запуске?
public class Application {
    public static void main(String[] args) {
        int x = 0;
        int y = x;
        y = 1;
        System.out.print(x + " " + y);
    }
}
//0 1