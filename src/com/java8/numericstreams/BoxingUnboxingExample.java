package com.java8.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingUnboxingExample {
    public static void main(String[] args) {
        System.out.println(boxing());

        List<Integer> list = boxing();
        System.out.println(unBoxing(list));
    }

    private static List<Integer> boxing(){
        return IntStream.rangeClosed(1, 50).boxed().collect(Collectors.toList());
    }

    private static int unBoxing(List<Integer> list){
        return list.stream().mapToInt(Integer::intValue).sum();
    }
}
