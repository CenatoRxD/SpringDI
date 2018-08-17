package pl.spring.di.classes;

import org.springframework.stereotype.Component;
import pl.spring.di.interfaces.IFortuneService;
import pl.spring.di.interfaces.IPosition;

@Component
public class Human {
    private IFortuneService fortuneService;

    private IPosition position;

    //Must have to constructor injection
    public Human(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    //Must have for setter injection
    public void setPosition(IPosition position) {
        this.position = position;
    }

    public String getFortune() {
        return fortuneService.getFortune();
    }

    public String getPosition() {
        return position.getPosition();
    }
}
