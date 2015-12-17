package proc.memory.gc.Question02;

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
            Object[] b = new Object[1];
            a[0] = b;
            b[0] = a;
            ref[0] = a;
        }
    }
}

//A.	yes
//>B.	no