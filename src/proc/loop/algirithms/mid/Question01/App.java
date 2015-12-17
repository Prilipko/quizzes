package proc.loop.algirithms.mid.Question01;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 21.08.13
 * Time: 14:51
 * To change this template use File | Settings | File Templates.
 */

//Это алгоритм

public class App {
    void f(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}

//>A.	обмена елементами
//B.	инвертирования массива
//C.	линейного поиска
//D.	бинарного поиска
//E.	сортировки "пузырьком"
//F.	сортировки вставками
//G.	сортировки выборками
//H.	ничего из перечисленного
