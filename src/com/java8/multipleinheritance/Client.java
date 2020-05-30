package com.java8.multipleinheritance;

public class Client implements InterfaceOne, InterfaceTwo, InterfaceThree {

    public static void main(String[] args) {
        Client client = new Client();
        client.methodA();
        client.methodB();
        client.methodC();
    }
}
