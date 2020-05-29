package com.java8.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapToExample {
    public static void main(String[] args) {
        System.out.println(mapToObject());
        System.out.println(mapToLong());
        System.out.println(mapToDouble());
    }

    private static List<String> mapToObject(){
        return IntStream.rangeClosed(1,50).mapToObj(String::valueOf).collect(Collectors.toList());
    }

    private static long mapToLong(){
        return IntStream.rangeClosed(1, 20).mapToLong(i->i).sum();
    }

    private static double mapToDouble(){
        return IntStream.rangeClosed(1, 20).mapToDouble(i->i).sum();
    }
}
