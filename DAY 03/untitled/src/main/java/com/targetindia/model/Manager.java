package com.targetindia.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Manager extends Employee{
    private int projectCount;

    public void print(){
        super.print();
        System.out.printf("Project Count        : %s",projectCount);
    }
}
