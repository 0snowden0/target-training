package com.target.programs;

import java.util.Scanner;
public class SwitchCaseDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the month for the days to be found : ");
        int month = sc.nextInt();
        int maxDays;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                maxDays=31;
                break;
            case 2:
                maxDays=28;
                break;
            default:maxDays=30;
        }
        System.out.printf("The number of days in the month %d is %d\n",month,maxDays);
    }
}
