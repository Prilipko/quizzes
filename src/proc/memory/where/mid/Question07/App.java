package proc.memory.where.mid.Question07;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 22.08.13
 * Time: 15:09
 * To change this template use File | Settings | File Templates.
 */
//Числа 0 и 1 буду занимать ячейки в памяти (предположительно)

public class App {
    void f() {
        Holder[][] i = {{new Holder(10, 0)}, {new Holder(1, 10)}};
    }
}
class Holder {
    int i;
    static int j;
    public Holder(int i, int j) {
        this.i = i;
        this.j = j;
    }
}

//A.	соседние в stack
//B.	произвольные в stack
//C.	соседние в heap
//>D.	произвольные в heap
//E.	соседние в PermGen
//F.	произвольные в PermGen
//G.	ничего из вышеперечисленного