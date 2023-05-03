package com.targetindia.programs;

import com.targetindia.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

@Slf4j
public class CreateEmployee {
    public static void main(String[] args){
        Employee e1 = new Employee();

        e1.setId(1381);
        e1.setFirstname("Prakash");
        e1.setLastname("C");
        e1.setPhone("+91 8330 8856835");
        e1.setEmail("prakashchidambaram2001@gmail.com");
        e1.setSalary(150000);
        e1.setDepartment("Backend development");

        log.trace("This is a Trace message");
        log.debug("This is a debug message");
        log.info("This is an info message");
        log.warn("This is a warn message");
        log.error("This is an error message");

        e1.print();

    }
}
