package pl.spring.java_configuration.components;

import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {
    public Employee() {
    }

    public String sayHello() {
        return "Hello";
    }
}
