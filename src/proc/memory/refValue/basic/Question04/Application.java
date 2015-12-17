package proc.memory.refValue.basic.Question04;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 21.08.13
 * Time: 10:32
 * To change this template use File | Settings | File Templates.
 */
public class Application {
    public static void main(String[] args) {
        String[] x = {"A"};
        String[] y = x;
        x = new String[]{"B"};
        System.out.print(x[0] + " " + y[0]);
    }
}
//B A