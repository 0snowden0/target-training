package com.target.programs;

import java.util.Scanner;
public class ForLoopDemo {
    public static void main(String[] args){
        printFactorial();
    }

    private static void printFactorial(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }

        System.out.printf("The Factorial of the Entered number %d is %d\n",n,f);
    }
}
