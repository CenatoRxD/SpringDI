package pl.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.spring.di.classes.Human;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Human human = context.getBean("human", Human.class);

        System.out.println(human.getFortune());
        System.out.println(human.getPosition());

        context.close();
    }
}
