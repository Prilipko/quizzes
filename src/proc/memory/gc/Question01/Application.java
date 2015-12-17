package proc.memory.gc.Question01;

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
        Object ref;
        while (true) {
            ref = new Object();
        }
    }
}

//A.	yes
//>B.	no