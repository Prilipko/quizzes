package proc.memory.refValue.basic.Question08;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 21.08.13
 * Time: 10:48
 * To change this template use File | Settings | File Templates.
 */
//Что напечатает данная программа при запуске?

public class Application {
    public static void main(String[] args) {
        Holder x = new Holder("A");
        Holder y = new Holder(x.value);
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
//A B