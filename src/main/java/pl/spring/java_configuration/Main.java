package pl.spring.java_configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.spring.java_configuration.components.Employee;
import pl.spring.java_configuration.configuration.Configuration;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);

        Employee employee = context.getBean("employee", Employee.class);

        System.out.println(employee. sayHello());
    }
}
