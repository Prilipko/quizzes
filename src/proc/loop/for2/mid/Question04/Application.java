package proc.loop.for2.mid.Question04;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 21.08.13
 * Time: 12:56
 * To change this template use File | Settings | File Templates.
 */
//Что выведет данная программа?

public class Application {
    public static void main(String[] args) {
        int[][] arr = {{0, 1}, {2, 3}};
        for (int i = 1; i >=0; i--) {
            for (int j = 1; j >=0; j--) {
                System.out.print(arr[i][j]);
            }
        }
    }
}
//A.	0123
//B.	1032
//C.	2301
//>D.	3210
//E.	1213
//F.	2031
//G.	1302
//H.	3120
//I.	0213