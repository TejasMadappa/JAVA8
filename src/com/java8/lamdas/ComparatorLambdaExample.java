package com.java8.lamdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        //before java 8
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println("Results : " + comparator.compare(11, 10));

        //using java8 lambda

        Comparator<Integer> comparator1 = (a1, a2) -> a1.compareTo(a2);
        System.out.println("Results using lambda : " + comparator1.compare(11, 10));
    }
}
