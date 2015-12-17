package proc.loop.algirithms.mid.Question04;

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
        for (int barrier = 0; barrier < array.length - 1; barrier++) {
            for (int index = barrier + 1; index < array.length; index++) {
                if (array[barrier] > array[index]) {
                    int tmp = array[index];
                    array[index] = array[barrier];
                    array[barrier] = tmp;
                }
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
//>G.	сортировки выборками
//H.	ничего из перечисленного
