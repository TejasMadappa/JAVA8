package com.java8.lamdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        //before java 8
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        //using java8 lambda
        Runnable runnable1 = () -> System.out.println("Inside runnable using lambda");

        Thread thread1 = new Thread(runnable1);
        thread1.start();
    }
}
