package proc.loop.algirithms.mid.Question02;

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
        for (int k = 0; k < array.length / 2; k++) {
            int tmp = array[k];
            array[k] = array[array.length - 1 - k];
            array[array.length - 1 - k] = tmp;
        }
    }
}

//A.	обмена елементами
//>B.	инвертирования массива
//C.	линейного поиска
//D.	бинарного поиска
//E.	сортировки "пузырьком"
//F.	сортировки вставками
//G.	сортировки выборками
//H.	ничего из перечисленного
