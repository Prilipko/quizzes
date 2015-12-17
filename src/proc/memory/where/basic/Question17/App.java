package proc.memory.where.basic.Question17;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 21.08.13
 * Time: 12:02
 * To change this template use File | Settings | File Templates.
 */
//Числа 0 и 1 буду занимать ячейки в памяти

public class App {
    static void f() {
        Holder i = new Holder(0, 1);
    }
}
class Holder {
    int i;
    int j;
    Holder(int i, int j) {
        this.i = i;
        this.j = j;
    }
}
//A.	соседние в stack
//B.	произвольные в stack
//>C.	соседние в heap
//D.	произвольные в heap
//E.	соседние в PermGen
//F.	произвольные в PermGen
//G.	ничего из вышеперечисленного