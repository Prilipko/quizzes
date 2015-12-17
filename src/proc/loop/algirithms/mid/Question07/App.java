package proc.loop.algirithms.mid.Question07;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 21.08.13
 * Time: 14:51
 * To change this template use File | Settings | File Templates.
 */

//Это алгоритм

public class App {
    void f(int[] array) {
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] > array[index + 1]) {
                int tmp = array[index];
                array[index] = array[index + 1];
                array[index + 1] = tmp;
            }
        }
    }
}

//A.	обмена елементами
//B.	инвертирования массива
//C.	линейного поиска
//D.	бинарного поиска
//E.	сортировки "пузырьком"
//F.	сортировки вставками
//G.	сортировки выборками
//>H.	ничего из перечисленного
