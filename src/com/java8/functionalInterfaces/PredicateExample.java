package com.java8.functionalInterfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (int1) -> int1 % 2 == 0;
        Predicate<Integer> predicate1 = (int2) -> int2 % 5 == 0;

        BiPredicate<Integer, Integer> predicate2 = (int1, int2) -> int1 > int2;

        System.out.println(predicate.and(predicate1).test(12));

        System.out.println(predicate.or(predicate1).test(12));

        System.out.println(predicate.and(predicate1).negate().test(12));
    }
}
