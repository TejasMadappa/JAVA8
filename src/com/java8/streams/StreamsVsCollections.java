package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsVsCollections {

    public static void main(String[] args) {
        //collections can be used to add or modify but with streams we cannot.
        List<String> names = new ArrayList<>();

        names.add("tejas");
        names.add("bhoomi");

       // names.stream().//there is no add or modify

        //in collection elements can be accessed in any order. (for ex: names.get(1))
        //but in streams elements can be accessed only in a sequence.

        //collections are eagerly constructed where as streams are lazily constructed.
        //once terminal operator is invoked streams does't start its process

        //collections can be traversed n times
        //streams can be traversed only once.

        for(String name : names){
            System.out.println(name);
        }
        for(String name : names){
            System.out.println(name);
        }

        Stream<String> namesStream = names.stream();
        namesStream.forEach(System.out::println);
        //if I try to traverse again, it will throw error
       // namesStream.forEach(System.out::println);

        //collections perform external iteration to iterate through the elements
        //streams perform internal iteration to iterate
    }
}
