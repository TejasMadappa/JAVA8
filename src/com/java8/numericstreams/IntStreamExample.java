package com.java8.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IntStreamExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        System.out.println(sumWithoutIntStream(list));
        System.out.println(sumWithIntStream());
    }

    private static int sumWithoutIntStream(List<Integer> list){
        return list.stream().reduce(0, (a,b)->a+b);
    }

    private static int sumWithIntStream(){
        return IntStream.rangeClosed(1,6).sum();
    }
}
