package proc.loop.algirithmsComponents.mid.Question09;

import static proc.loop.algirithmsComponents.mid.UtilsTest.swap;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 21.08.13
 * Time: 15:46
 * To change this template use File | Settings | File Templates.
 */

//После выполнения этого метода что произойдет с элементами массива
// (swap - функция обмена елементов массива)?
public class App {
    public static void fun(int[] data) {
        for (int k = 1; k < data.length; k++) {
            if (data[0] > data[k]) {
                swap(data, 0, k);
            }
        }
    }
}
//A.	элементы инвертируются
//B.	первый станет последним
//C.	последний станет первым
//D.	первый - самый большой
//>E.	первый - самый малый
//F.	последний - самый большой
//G.	последний - самый малый
//H.	ничего из вышеперечисленного


