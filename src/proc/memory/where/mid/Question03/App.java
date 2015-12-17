package proc.memory.where.mid.Question03;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 22.08.13
 * Time: 15:09
 * To change this template use File | Settings | File Templates.
 */
//Числа 0 и 1 буду занимать ячейки в памяти (предположительно)

public class App {
    static void f() {
        HolderA h = new HolderA(0, 1);
    }
}
class HolderA {
    static HolderB i;
    static HolderB j;

    public HolderA(int i, int j) {
        this.i = new HolderB(i);
        this.j = new HolderB(j);
    }
}
class HolderB {
    int data;
    public HolderB(int data) {
        this.data = data;
    }
}
//A.	соседние в stack
//B.	произвольные в stack
//C.	соседние в heap
//D.	произвольные в heap
//E.	соседние в PermGen
//>F.	произвольные в PermGen
//G.	ничего из вышеперечисленного