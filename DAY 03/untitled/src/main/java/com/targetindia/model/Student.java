package com.targetindia.model;

import lombok.Data;

@Data
public class Student extends Person{
    private String rollno;
    private double gpa;
    private String majorSubject;

    @Override
    public void print(){
        System.out.printf("Roll No.         : %s\n",rollno);
        super.print();
        System.out.printf("GPA              : %s\n",gpa);
        System.out.printf("Major Subject    : %s\n",majorSubject);
    }

    public String getGrade(){
        if (gpa>7){
            return "Grade A Student";
        }
        if (gpa>5){
            return "Grade B Student";
        }
        if (gpa>4){
            return "Grade C Student";
        }
        return "Grade D Student";
    }

}
