package proc.memory.refValue.basic.Question03;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 21.08.13
 * Time: 10:29
 * To change this template use File | Settings | File Templates.
 */
//Что напечатает данная программа при запуске?

public class Application {
    public static void main(String[] args) {
        Holder x = new Holder(0);
        Holder y = new Holder(x.value);
        x.value = 1;
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