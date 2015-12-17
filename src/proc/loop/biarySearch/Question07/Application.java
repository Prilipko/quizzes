package proc.loop.biarySearch.Question07;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 21.08.13
 * Time: 14:18
 * To change this template use File | Settings | File Templates.
 */
//Что выведет данная программа после запуска?

import static java.util.Arrays.binarySearch;

public class Application {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{10, 20, 30}, 20));
    }
}
//A.	-4
//B.	-3
//C.	-2
//D.	-1
//E.	0
//>F.	1
//G.	2
//H.	3
//I.	4