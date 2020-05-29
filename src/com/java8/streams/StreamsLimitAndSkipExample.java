package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitAndSkipExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,6,3,10,20);
//        Optional<Integer> result = testLimit(list);

        Optional<Integer> result = testSkip(list);
        if(result.isPresent()){
            System.out.println("The sume is "+result.get());
        }else{
            System.out.println("The list is empty");
        }
    }

    private static Optional<Integer> testLimit(List<Integer> list){
        return list.stream().limit(20).reduce((a, b)-> a+b);
    }

    private static Optional<Integer> testSkip(List<Integer> list){
        return list.stream().skip(3).reduce((a, b)-> a+b);
    }
}
