package com.java8.multipleinheritance;

public interface InterfaceTwo {
    default void methodB(){
        System.out.println("Method B "+InterfaceTwo.class);
    }
}
