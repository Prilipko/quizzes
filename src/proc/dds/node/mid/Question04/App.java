package proc.dds.node.mid.Question04;

/**
 * Created with IntelliJ IDEA.
 * User: worker
 * Date: 21.08.13
 * Time: 21:50
 * To change this template use File | Settings | File Templates.
 */
//Что напечатает данная программа при запуске?

public class App {
    public static void main(String[] args) {
        Node refA = new Node(1, new Node(2, null));
        refA.next.next = refA;
        Node refB = new Node(3, refA.next);
        System.out.println(refB.next.next.next.value);
    }
}
class Node {
    int value;
    Node next;
    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
//A.	1
//>B.	2
//C.	3