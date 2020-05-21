package com.java8.lamdas;

import java.util.function.Consumer;

public class LamdbaVariable2 {
    public static void main(String[] args) {
        int value = 4;
        Consumer<Integer> consumer = (i) ->{
            System.out.println(value + i); //this works

            //value++; //as soon as we add this line, it gives error here and as well as in sout statement.
            //this is called effective final. Even though we have not declared value as final.
            // It acts as a final as soon as it is used inside lamdba body.
        };
        //value = 6; here also , we cannot do this, as this variable is being referred in the lamdba scope.
        //but if we declare value as instance variable, there will not be any error.

        consumer.accept(10);
    }
}
