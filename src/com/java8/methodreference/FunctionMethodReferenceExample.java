package com.java8.methodreference;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionMethodReferenceExample {
    static UnaryOperator<String> unaryOperator = (s)->s.toUpperCase();

    //using method reference
    static UnaryOperator<String> reference = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(reference.apply("tejas"));

        System.out.println(unaryOperator.apply("bhoomi"));
    }
}
