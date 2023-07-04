package org.example;


import org.example.collections.CollectionsDemo;
import org.example.exceptions.ExceptionsDemo;
import org.example.generics.GenericList;
import org.example.generics.List;
import org.example.generics.User;
import org.example.generics.Utils;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

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

//        CollectionsDemo.show();
//        try {
//            ExceptionsDemo.show();
//        } catch (IOException e) {
//            System.out.println("An unexpected error occurred");
//        }
    }
}