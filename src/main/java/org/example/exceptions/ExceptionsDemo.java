package org.example.exceptions;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show() throws IOException {
        // try with resources statement
        try (
            var reader = new FileReader("file.txt");
            var writer = new FileWriter("..");
        ) {
            var value = reader.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Rethrowing exceptions
        var account = new Account();
        try {
            account.deposit(10);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw e;
        }

        try {
            account.withdraw(10);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
//    public static void sayHello(String name) {
//        System.out.println(name.toUpperCase());
//    }
}
