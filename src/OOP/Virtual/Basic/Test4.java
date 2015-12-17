package OOP.Virtual.Basic;

class Parent4 {
    static String first() {
        return second;
    }
    static String second = "Parent";
}
class Child4 extends Parent4 {
    static String second = "Child";
}
class Test4 {
    public static void main(String[] args) {
        System.out.println(new Child4().first());
        System.out.println( Child4.first());
        System.out.println(Parent4.first());
    }
}