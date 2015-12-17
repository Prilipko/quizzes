package proc.memory.refValue.basic.Question07;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 21.08.13
 * Time: 10:40
 * To change this template use File | Settings | File Templates.
 */
//Что напечатает данная программа при запуске?

public class Application {
    public static void main(String[] args) {
        Object[] x = {"A"};
        Object[] y = {"A"};
        y[0] = x[0];
        x[0] = "B";
        System.out.print(x[0] + " " + y[0]);
    }
}
//B A
//После x[0] = "B"; в x[0] уже другая ссылка