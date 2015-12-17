package proc.loop.algirithms.mid.Question05;

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
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = array[mid];
            if (midVal < x)
                low = mid + 1;
            else if (midVal > x)
                high = mid - 1;
            else
                return mid;
        }
        return -(low + 1);
    }
}

//A.	обмена елементами
//B.	инвертирования массива
//C.	линейного поиска
//>D.	бинарного поиска
//E.	сортировки "пузырьком"
//F.	сортировки вставками
//G.	сортировки выборками
//H.	ничего из перечисленного
//Сразу не узнал алгоритм бинарного поиска
