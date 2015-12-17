package OOP.Virtual.Basic;

class ParentMessage {
    String call = "Parent";
}

class ChildMessage extends ParentMessage {
    String call = "Child";
}

class Test3 {
    public static void main(String[] args) {
        send(new ChildMessage());
    }

    public static void send(ParentMessage msg) {
        System.out.println(((ChildMessage) msg).call);
        System.out.println(msg.call);
    }
}