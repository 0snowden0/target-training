package com.targetindia.model;

import lombok.Data;

@Data
public class Artist extends Person{
    private String type;

    public String getGrade(){
        return "Grade A";
    }
}
