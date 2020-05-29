package com.java8.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamsOfIterateGenerateExample {
    public static void main(String[] args) {
        Stream<String> streams = Stream.of("a", "b", "c");

//        streams.forEach(System.out::println);

//        iterate
        Stream.iterate(1,a->a*2)
        .forEach(System.out::println);

        //generate and iterate runs infinitly. We can give limit
        Supplier<Integer> supplier = new Random()::nextInt;
        Stream.generate(supplier).forEach(System.out::println);
    }
}
