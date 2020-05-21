package com.java8.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

//exactly opposite to consumer interface.
public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = () ->{
            return "tejas";
        };

        System.out.println(stringSupplier.get());

        List<String> names = Arrays.asList("tejas", "bhoomi", "hassan");

        Supplier<List<String>> namesSupplier = () ->  names;
        System.out.println(namesSupplier.get());
    }
}
