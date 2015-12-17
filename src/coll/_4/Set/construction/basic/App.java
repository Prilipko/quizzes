package coll._4.Set.construction.basic;

import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        Set set = new TreeSet<>();
        set.add(new String[]{"A"});
        set.add(new String[]{"B"});
        set.add(new String[]{"A"});
        System.out.println(set.size());
    }
}