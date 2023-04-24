package com.target.programs;

public class CommandLineArguments {
    public static void main(String[] args){
        System.out.printf("The Length of the command line arguments is %d\n",args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.printf("The args[%d] = %s\n",i,args[i]);
        }
    }
}
