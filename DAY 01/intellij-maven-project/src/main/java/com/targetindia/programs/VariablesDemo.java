package com.targetindia.programs;

public class VariablesDemo {
    public static void main(String[] args){
        byte b1;
        short s1 = 102;
        int i1 = 494;
        long l1;
        String myName = "Prakash";
        System.out.println("My Name is "+myName);

        b1 = 100;

        System.out.println("b1 = "+b1);

        String st1 = "1000";
        String st2 = "2000";
        String st3 = st1+st2;
        System.out.println("st3 = "+st3);

        int n1 = Integer.parseInt(st1);
        int n2 = Integer.parseInt(st2);
        int n3 = n1+n2;
        System.out.println("n3 = "+n3);

    }
}
