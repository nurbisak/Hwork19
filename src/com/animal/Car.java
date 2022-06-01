package com.animal;


public class Car implements AutoCloseable{
    public static void drive(){
        System.out.println("car is driving");


    }

    @Override
    public void close() throws Exception {
        System.out.println("closed");
    }
}
