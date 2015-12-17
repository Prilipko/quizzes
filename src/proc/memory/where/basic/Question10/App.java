package proc.memory.where.basic.Question10;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 21.08.13
 * Time: 11:49
 * To change this template use File | Settings | File Templates.
 */
//Числа 0 и 1 буду занимать ячейки в памяти

class App {
    byte i = 0;
    byte j = 1;
}
//A.	соседние в stack
//B.	произвольные в stack
//>C.	соседние в heap
//D.	произвольные в heap
//E.	соседние в PermGen
//F.	произвольные в PermGen
//G.	ничего из вышеперечисленного
//соседние в хипе но только после создания обьекта, а до этого в пермжене?
//Всё же имелось ввиду что объект создан!