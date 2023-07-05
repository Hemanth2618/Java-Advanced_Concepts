package org.example;


import org.example.collections.CollectionsDemo;
import org.example.collections.Customer;
import org.example.collections.EmailComparator;
import org.example.generics.GenericList;
import org.example.generics.User;
import org.example.generics.Utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("b", "e3"));
        customers.add(new Customer("a", "e2"));
        customers.add(new Customer("c", "e1"));
        Collections.addAll(customers, new Customer("d", "e4"), new Customer("f", "e5"), new Customer("e", "e6"));
        Collections.sort(customers);
        // Sorting using a comparator. Using emails, the customers will be sorted
        customers.sort(new EmailComparator());
        // We get a weird string as output of each element since every element is an object
        System.out.println(customers);

        var list1 = new GenericList<String>();
        list1.add("a");
        list1.add("b");
        var iterator = list1.iterator();
        while (iterator.hasNext()) {
            var current = iterator.next();
            System.out.println(current);
        }
        // Internally for each loop uses iterator interface and it is just a syntactic sugar for above while code block
        for (var item: list1)
            System.out.println(item);

        // If we use Object class, we will have runtime type errors
        // With generics, we will have compile time type safety rather than at runtime.
        GenericList<Integer> list = new GenericList<>();
        list.add(1); // Boxing - Wrap thr primitive value inside an instance of Integer class
        int number = list.get(0); // Unboxing - Unwrap the reference type to primitive type

        var user1 = new User(10);
        var user2 = new User(20);
        if (user1.compareTo(user2) < 0)
            System.out.println("User1 < User2");
        else if (user1.compareTo(user2) == 0)
            System.out.println("User1 == User2");
        else
            System.out.println("User1 > User2");

        var max = Utils.max(1, 3);
        System.out.println(max);
        var max1 = Utils.max(new User(10), new User(20));
        System.out.println(max1);

        Utils.print(1, "Water");

        CollectionsDemo.show();

//        try {
//            ExceptionsDemo.show();
//        } catch (IOException e) {
//            System.out.println("An unexpected error occurred");
//        }
    }
}