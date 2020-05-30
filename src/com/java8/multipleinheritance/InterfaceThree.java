package com.java8.multipleinheritance;

public interface InterfaceThree {
    default void methodC(){
        System.out.println("Method A "+InterfaceThree.class);
    }
}
