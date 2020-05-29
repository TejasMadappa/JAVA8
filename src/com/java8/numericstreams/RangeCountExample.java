package com.java8.numericstreams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class RangeCountExample {
    public static void main(String[] args) {
        IntStream.range(1, 50)
                .forEach((value) ->System.out.print(value+","));
        System.out.println();
        IntStream.rangeClosed(1, 50)
                .forEach((value) ->System.out.print(value+","));
        System.out.println();
        System.out.print(IntStream.rangeClosed(1,100).count());

        LongStream.range(50, 70);

        //to get double stream rangem
        LongStream.range(1, 20).asDoubleStream().forEach(val->System.out.print(val+","));
    }
}
