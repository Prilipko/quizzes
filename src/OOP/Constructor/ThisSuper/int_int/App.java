package OOP.Constructor.ThisSuper.int_int;

class A {
    A(int k) {}
}
class B extends A {
    B() {this(0);}
    B(int k) {super(0);}
}

public class App {
}
