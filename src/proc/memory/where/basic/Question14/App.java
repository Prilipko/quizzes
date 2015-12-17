package proc.memory.where.basic.Question14;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 21.08.13
 * Time: 11:59
 * To change this template use File | Settings | File Templates.
 */
//Числа 0 и 1 буду занимать ячейки в памяти

class App {
    Holder i = new Holder(0);
    Holder j = new Holder(1);
}
class Holder {
    int data;
    Holder(int data) {
        this.data = data;
    }
}
//A.	соседние в stack
//B.	произвольные в stack
//C.	соседние в heap
//>D.	произвольные в heap
//E.	соседние в PermGen
//F.	произвольные в PermGen
//G.	ничего из вышеперечисленного