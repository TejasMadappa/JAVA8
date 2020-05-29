package com.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceMinMaxExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 3, 10, 11);
//        Optional<Integer> result = getMaxValue(list);
//        Optional<Integer> result = getMaxValue(new ArrayList<>());
        Optional<Integer> result = getMinValue(list);
        if(result.isPresent()){
            System.out.println("Max value is "+result.get());
        }else{
            System.out.println("List is empty");
        }
    }

    private static Optional<Integer> getMaxValue(List<Integer> list){
        return list.stream().reduce((a, b)-> a>b ? a : b);
    }

    private static Optional<Integer> getMinValue(List<Integer> list){
        return list.stream().reduce((a, b)-> a<b ? a : b);
    }
}
