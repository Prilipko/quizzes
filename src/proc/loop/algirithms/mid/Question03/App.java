package proc.loop.algirithms.mid.Question03;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 21.08.13
 * Time: 14:51
 * To change this template use File | Settings | File Templates.
 */

//Это алгоритм

public class App {
    int f(int[] array, int x) {
        for (int k = 0; k < array.length; k++) {
            if (array[k] == x) {
                return k;
            }
        }
        return -1;
    }
}

//A.	обмена елементами
//B.	инвертирования массива
//>C.	линейного поиска
//D.	бинарного поиска
//E.	сортировки "пузырьком"
//F.	сортировки вставками
//G.	сортировки выборками
//H.	ничего из перечисленного
