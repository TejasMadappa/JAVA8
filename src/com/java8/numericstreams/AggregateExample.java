package com.java8.numericstreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class AggregateExample {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 20).sum();
        System.out.println(sum);

        OptionalInt max = IntStream.rangeClosed(2, 10).max();
        System.out.println(max);

        OptionalInt min = IntStream.rangeClosed(2, 10).min();
        System.out.println(min);

        OptionalDouble avg = IntStream.rangeClosed(0, 50).average();
        System.out.println(avg);
    }
}
