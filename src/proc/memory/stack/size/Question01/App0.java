package proc.memory.stack.size.Question01;

/**
 * Created with IntelliJ IDEA.
 * User: worker
 * Date: 21.08.13
 * Time: 22:29
 * To change this template use File | Settings | File Templates.
 */

//При фиксированном размере стека, какая из неограниченных
//рекурсий "рухнет" РАНЬШЕ по StackOverflowError (предположительно)
public class App0 {
    int fun(int k0, int k1, int k2) {
        return fun(k0, k1, k2);
    }
}
//A.	первая
//B.	вторая
//C.	одинаково