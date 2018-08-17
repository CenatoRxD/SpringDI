package pl.spring.di.impl;

import pl.spring.di.interfaces.IFortuneService;

public class HappyFortuneServiceImpl implements IFortuneService {

    @Override
    public String getFortune() {
        return "Today is lucky day";
    }
}
