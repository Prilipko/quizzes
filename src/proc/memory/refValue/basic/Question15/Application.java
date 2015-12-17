package proc.memory.refValue.basic.Question15;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 21.08.13
 * Time: 11:03
 * To change this template use File | Settings | File Templates.
 */
//Что напечатает данная программа при запуске?

public class Application {
    public static void main(String[] args) {
        Holder x = new Holder(0);
        Holder y = new Holder(x.value);
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