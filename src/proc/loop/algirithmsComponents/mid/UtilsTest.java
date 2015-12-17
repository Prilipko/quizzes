package proc.loop.algirithmsComponents.mid;

import java.util.Arrays;

import static proc.loop.algirithmsComponents.mid.Question12.App.fun;
/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 21.08.13
 * Time: 15:48
 * To change this template use File | Settings | File Templates.
 */
public class UtilsTest {

    public static void swap(int[] arr, int x, int y) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;

    }

    public static void main(String[] args) {
        int[] arr ={5,2,9,6,1,7,3,0,4,8};
        System.out.println(Arrays.toString(arr));
        fun(arr);
        System.out.println(Arrays.toString(arr));
    }
}
