package proc.memory.refValue.basic.Question02;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 21.08.13
 * Time: 10:27
 * To change this template use File | Settings | File Templates.
 */
//    Что напечатает данная программа при запуске?

public class Application {
    public static void main(String[] args) {
        Holder x = new Holder("A");
        Holder y = x;
        y.value = "B";
        System.out.print(x.value + " " + y.value);
    }
}

class Holder {
    String value;

    Holder(String v) {
        value = v;
    }
}
//B B