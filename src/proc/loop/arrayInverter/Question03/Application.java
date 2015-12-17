package proc.loop.arrayInverter.Question03;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 21.08.13
 * Time: 13:29
 * To change this template use File | Settings | File Templates.
 */
//Корректная ли это реализация алгоритма инвертирования массива?

public class Application {
    public static void invert(int[] arr) {
        for (int k = 0; k < arr.length / 2; k++) {
            int tmp = arr[k];
            arr[k] = arr[arr.length - k - 1];
            arr[arr.length - k - 1] = tmp;
        }
    }
}

//>A.	yes
//B.	no