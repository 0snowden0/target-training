package com.target.programs;

public class UserDefinedFunctions {
    static void sayHello(){
        System.out.println("Hello Java !");
    }

    static void sayHello(String s){
        System.out.printf("Hello, %s !",s);
    }
    public static void main(String[] args){
        sayHello();
        sayHello("Prakash");

    }
}
