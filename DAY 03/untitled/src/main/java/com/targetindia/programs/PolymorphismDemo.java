package com.targetindia.programs;

import com.targetindia.model.Employee;
import com.targetindia.model.Artist;
import com.targetindia.model.Student;
import com.targetindia.model.Person;


public class PolymorphismDemo {
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.setFirstname("Susheelan");
        e1.setPhone("+91 8330 8856835");
        e1.setEmail("susheelan@xyz.com");
        e1.setSalary(15000000);
        e1.setDepartment("Main");

        Student s1 = new Student();
        s1.setRollno("984");
        s1.setFirstname("Rajiv");
        s1.setEmail("rajiv@xmpl.com");
        s1.setGpa(6.78);
        s1.setMajorSubject("Maths");

        Person p1;

        p1=e1;
        p1.print();
        System.out.println();
        p1 = s1;
        p1.print();

    }
}
