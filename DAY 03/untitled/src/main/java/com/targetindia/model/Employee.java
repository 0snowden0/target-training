package com.targetindia.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Employee extends Person{
    private int id;
    private double salary;
    private String department;

    public void print(){
        System.out.printf("ID           : %s\n",id);
        super.print();
        System.out.printf("Salary       : %s\n", salary);
        System.out.printf("Department   : %s\n",department);
    }

    public String getGrade(){
        if (salary>100000){
            return "Grade A Employee";
        }
        if (salary>50000){
            return "Grade B Employee";
        }
        if (salary>25000){
            return "Grade C Employee";
        }
        return "Grade D Employee";
    }
}
