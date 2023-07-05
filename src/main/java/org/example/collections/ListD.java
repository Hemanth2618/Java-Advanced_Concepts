package org.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListD {
    public static void show() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add(1, "b");
        Collections.addAll(list, "c", "d", "e");
        list.set(1, "r");
        list.remove(0);
        System.out.println(list.indexOf("d"));
        System.out.println(list.lastIndexOf("e"));
        System.out.println(list.subList(1, 3));
        System.out.println(list.get(1));
    }
}
