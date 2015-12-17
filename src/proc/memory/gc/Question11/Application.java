package proc.memory.gc.Question11;

/**
 * Created with IntelliJ IDEA.
 * User: Prilipko
 * Date: 22.08.13
 * Time: 10:53
 * To change this template use File | Settings | File Templates.
 */
//Исчерпается ли память (OutOfMemoryError) в "куче"/heap при выполнении данной программы?

class Application {
    public static void main(String[] args) {
        Object[] ref = new Object[1];
        while (true) {
            ref[0] = new Object[1];
            ref = (Object[]) ref[0];
        }
    }
}

//A.	yes
//>B.	no