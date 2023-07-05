package org.example.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "c");
        System.out.println(collection.size());
        System.out.println(collection.contains("a"));
        collection.remove("a");

        // Converting the collection to an array of objects
        var objectArray = collection.toArray();
        var stringArray = collection.toArray(new String[0]);
        Collection<String> other = new ArrayList<>(collection);
        System.out.println(other.equals(collection));
    }
}
