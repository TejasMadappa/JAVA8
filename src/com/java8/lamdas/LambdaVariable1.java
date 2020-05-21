package com.java8.lamdas;

import java.util.function.Consumer;

//varaibel naming restrictions in lambda
public class LambdaVariable1 {
    public static void main(String[] args) {
        int i = 0;
        //the below code gives compiler error. As i is already defined in the scope
        /*Consumer<Integer> consumer = (i) -> {
            System.out.println(i);
        */
    }
}
