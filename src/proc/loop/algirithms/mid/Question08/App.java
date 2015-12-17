package proc.loop.algirithms.mid.Question08;

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
        for (int barrier = 1; barrier < arr.length; barrier++) {
            int newElement = arr[barrier];
            int location = barrier - 1;
            while (location >= 0 && arr[location] > newElement) {
                arr[location + 1] = arr[location];
                location--;
            }
            arr[location + 1] = newElement;
        }
    }
}

//A.	обмена елементами
//B.	инвертирования массива
//C.	линейного поиска
//D.	бинарного поиска
//E.	сортировки "пузырьком"
//>F.	сортировки вставками
//G.	сортировки выборками
//H.	ничего из перечисленного
