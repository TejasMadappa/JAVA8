package com.java8.parallelstreams;

import java.util.stream.IntStream;

public class ParallelStreamsExample {
    public static void main(String[] args) {
        System.out.println(sumWithStreams());
        System.out.println(sumWithParallelStreams());
    }

    private static int sumWithStreams(){
        return IntStream.rangeClosed(1, 100000)
                .sum();
    }

    private static int sumWithParallelStreams(){
        return IntStream.rangeClosed(1, 100000)
                .parallel().sum();
    }
}
