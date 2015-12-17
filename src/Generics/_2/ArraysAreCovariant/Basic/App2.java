package Generics._2.ArraysAreCovariant.Basic;

public class App2 {
    public static void main(String[] args) {
        Object[] array = new String[1];
        array[0] = new Object();
    }
}