package com.targetindia.model;

import lombok.Data;

@Data
public abstract class Person {
    private String firstname;
    private String lastname;
    private String email;
    private String phone;

    public void print(){
        System.out.printf("Name             : %s %s\n",firstname,(lastname==null)?"":lastname);
        System.out.printf("Email            : %s\n",email);
        System.out.printf("Phone No.        : %s\n",phone);
    }

    public abstract String getGrade();
}
