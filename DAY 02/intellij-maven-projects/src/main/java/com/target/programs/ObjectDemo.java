package com.target.programs;

import com.target.model.Person;

public class ObjectDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Prakash C";
        p1.age = 21;

        System.out.println(p1.name);
        System.out.println(p1.age);
    }

}
