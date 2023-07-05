package org.example.collections;

import java.util.*;

public class SetD {
    public void show() {
        Set<String> set = new HashSet<>();
        set.add("sky");
        set.add("blue");
        set.add("is");
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "c", "c");
        // This removes the duplicate elements
        Set<String> set1 = new HashSet<>(collection);
        System.out.println(set1);
        Set<String> set2 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set3 = new HashSet<>(Arrays.asList("b", "c", "d"));
        //Union
        System.out.println(set2.addAll(set3));
        // Intersection
        System.out.println(set2.retainAll(set3));
        // Difference
        System.out.println(set2.removeAll(set3));
    }
}
