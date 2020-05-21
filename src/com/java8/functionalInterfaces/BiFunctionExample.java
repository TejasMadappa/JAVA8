package com.java8.functionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {
     BiFunction<List<String>, Predicate<String>, List<String>> biFunction = (names, predicate) ->{
        List<String> nameStartWithT = new ArrayList<>();
        names.forEach(name -> {
            if(predicate.test(name)){
                nameStartWithT.add(name);
            }
        });
        return nameStartWithT;
    };

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tejas", "tejas", "bhoomi", "hassan");
        Predicate<String> predicate = (s) -> s.startsWith("t") || s.startsWith("T");

        List<String> result = new BiFunctionExample().biFunction.apply(names, predicate);
        System.out.println(result.size());
    }
}
