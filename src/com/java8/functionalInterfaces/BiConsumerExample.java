package com.java8.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println("Value of a:" + a +", Value of b:" + b);

        //biConsumer.accept("tejas", "bhoomi");

        List<String> names = Arrays.asList("tejas", "bhoomi", "hassan");
        names.forEach(name -> biConsumer.accept("t", "b"));
    }
}
