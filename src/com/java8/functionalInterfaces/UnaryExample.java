package com.java8.functionalInterfaces;

import java.util.function.UnaryOperator;

//unary  operator extend Function interface. Just that, when the input and out put are same we can go for unary interface.
public class UnaryExample {
    static UnaryOperator<String> unaryOperator = (s) -> s.concat(" ").concat("Tutorial");

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("java8"));
    }
}
