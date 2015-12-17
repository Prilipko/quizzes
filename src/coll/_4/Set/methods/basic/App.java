package coll._4.Set.methods.basic;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set set = new HashSet<>();
        set.remove(set.remove(set.remove(false)));
        System.out.println(set.size());
    }
}