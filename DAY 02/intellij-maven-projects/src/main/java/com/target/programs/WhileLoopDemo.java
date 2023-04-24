package com.target.programs;

import  java.util.Scanner;
public class WhileLoopDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();

        if (n == 0){
            System.out.printf("output is %d ",0);
            return;
        }

        if (n==1){
            System.out.printf("output is %d ", 1);
            return;
        }
        int a = 0;
        int b = 1;
        int c = 1;
        int temp;

        while (c<=n){
            temp = c;
            c = a+b;
            a = b;
            b = temp;
        }

        System.out.printf("The output is %d", (c==n)?c:b);

    }
}
