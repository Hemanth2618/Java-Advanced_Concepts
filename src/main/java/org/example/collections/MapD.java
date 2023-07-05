package org.example.collections;

import java.util.HashMap;
import java.util.Map;

public class MapD {
    public static void show() {
        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");
        // A Map interface represents a hash table
        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);
        System.out.println(map.get("e1"));
        var Unknown = new Customer("Unknown", "");
        System.out.println(map.getOrDefault("e10", Unknown));
        var exists = map.containsKey("e10");
        System.out.println(exists);

        for (var key: map.keySet())
            System.out.println(key);
        for (var entry: map.entrySet()) {
            System.out.println(entry.getValue());
            System.out.println(entry.getKey());
        }
        for (var customer: map.values())
            System.out.println(customer);
    }
}
