package com.java8.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());
        Consumer<String> consumer1 = (s) -> System.out.println(s.toLowerCase());

        List<String> names = Arrays.asList("tejas", "bhoomi", "hassan");
        //print only to uppercase
        names.forEach(consumer);

        //print both upper and lowercase
        names.forEach(consumer.andThen(consumer1));

        //print based on condition
        names.forEach(name -> {
            if(name.startsWith("t"))
            {
                consumer.andThen(consumer1).accept(name);
            }
        });
    }
}
