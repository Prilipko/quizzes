package proc.loop.algirithms.mid.Question06;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 21.08.13
 * Time: 14:51
 * To change this template use File | Settings | File Templates.
 */

//Это алгоритм

public class App {
    void f(int[] arr) {
        for (int barrier = arr.length - 1; barrier >= 0; barrier--) {
            for (int index = 0; index < barrier; index++) {
                if (arr[index] > arr[index + 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = tmp;
                }
            }
        }
    }
}

//A.	обмена елементами
//B.	инвертирования массива
//C.	линейного поиска
//D.	бинарного поиска
//>E.	сортировки "пузырьком"
//F.	сортировки вставками
//G.	сортировки выборками
//H.	ничего из перечисленного
