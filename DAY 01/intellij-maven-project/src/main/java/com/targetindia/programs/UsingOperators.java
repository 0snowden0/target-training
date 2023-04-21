package com.targetindia.programs;

public class UsingOperators {
    public static void main(String[] args){
        int n1 = 123;
        int n2 = 234;
        System.out.println(n1+n2);

        System.out.println(n1/10);
        System.out.println(n1%10);

        System.out.println("n1 is a " + ((n1%2==0)?"Even":"Odd") + " number");
        System.out.println("n2 is a " + ((n2%2 == 0)?"Even":"Odd") + " Number");
    }
}
