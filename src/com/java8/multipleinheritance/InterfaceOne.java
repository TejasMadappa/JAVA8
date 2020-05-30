package com.java8.multipleinheritance;

public interface InterfaceOne {
    default void methodA(){
        System.out.println("Method A "+InterfaceOne.class);
    }
}
