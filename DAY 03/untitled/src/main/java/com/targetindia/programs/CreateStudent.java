package com.targetindia.programs;

import com.targetindia.model.Student;

public class CreateStudent {
    public static void main(String[] args){
        Student s1 = new Student();

        s1.setFirstname("Prakash");
        s1.setLastname("C");
        s1.setEmail("prakashchidambaram2001@gmail.com");
        s1.setPhone("+91 833088 6835");
        s1.setRollno("B190971EE");
        s1.setGpa(8.2);
        s1.setMajorSubject("Electrical and Electronics Engineering");

        s1.print();

    }
}
