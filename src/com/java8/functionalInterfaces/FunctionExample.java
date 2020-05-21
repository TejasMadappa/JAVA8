package com.java8.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, String> function = (s) -> s.toUpperCase();
        Function<String, String> function1 = (s -> s.concat("bhoomi"));
        Function<String, Integer> function3 = (s) -> s.hashCode();

        System.out.println(function3.apply("hashcode of string"));

        System.out.println(function.apply("tejas"));

        System.out.println(function.andThen(function1).apply("tejas"));

        System.out.println(function.compose(function1).apply("tejas"));

    }
}
