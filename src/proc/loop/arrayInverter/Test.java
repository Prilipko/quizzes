package proc.loop.arrayInverter;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 21.08.13
 * Time: 13:56
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));
        proc.loop.arrayInverter.Question05.Application.invert(arr);
        System.out.println(Arrays.toString(arr));
    }
}
