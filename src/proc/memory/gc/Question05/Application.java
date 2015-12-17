package proc.memory.gc.Question05;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 22.08.13
 * Time: 10:53
 * To change this template use File | Settings | File Templates.
 */
//Исчерпается ли память (OutOfMemoryError) в "куче"/heap при выполнении данной программы?

public class Application {
    public static void main(String[] args) {
        Object[] ref = new Object[1];
        while (true) {
            Object[] a = new Object[1];
            Object[] b = {a};
            a[0] = b;
            ref[0] = new Object[]{a, b};
        }
    }
}

//A.	yes
//>B.	no