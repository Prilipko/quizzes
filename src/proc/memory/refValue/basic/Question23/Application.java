package proc.memory.refValue.basic.Question23;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 21.08.13
 * Time: 11:13
 * To change this template use File | Settings | File Templates.
 */
//Что напечатает данная программа при запуске?

public class Application {
    public static void main(String[] args) {
        Holder x = new Holder(0);
        Holder y = x;
        x = new Holder(1);
        System.out.print(x.value + " " + y.value);
    }
}
class Holder {
    int value;
    Holder(int v) {
        value = v;
    }
}
//1 0