package pl.spring.di.impl;

import pl.spring.di.interfaces.IPosition;

public class ManagerImpl implements IPosition {
    public ManagerImpl() {
    }

    @Override
    public String getPosition() {
        return "Manager";
    }
}
