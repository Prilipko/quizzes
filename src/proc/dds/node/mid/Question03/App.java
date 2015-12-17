package proc.dds.node.mid.Question03;

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
        Node refA = new Node(1, new Node(2, new Node(3, new Node(4, null))));
        refA.next.next.next = refA.next;
        Node refB = refA.next.next;
        System.out.println(refB.value);
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
//B.	2
//>C.	3
//D.	4