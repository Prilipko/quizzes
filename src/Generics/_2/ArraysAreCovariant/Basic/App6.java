package Generics._2.ArraysAreCovariant.Basic;

public class App6 {
    public static void main(String[] args) {
        String[] strArray = new String[1];
        Object[] objArray = strArray;
        objArray[0] = "A";
        String str = strArray[0];
    }
}