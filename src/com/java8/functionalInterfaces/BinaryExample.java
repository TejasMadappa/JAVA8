package com.java8.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

//it is extending BiFunctional interface. Just that it should take same type of 2 inputs and returns the output of same type.
public class BinaryExample {
    static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);

    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        System.out.println(binaryOperator.apply(5, 10));

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println(maxBy.apply(10, 20));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println(minBy.apply(-90, 200));
    }
}
