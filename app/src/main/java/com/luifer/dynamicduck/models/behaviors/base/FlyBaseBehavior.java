package com.luifer.dynamicduck.models.behaviors.base;


public abstract class FlyBaseBehavior implements BaseBehavior {

    public abstract void fly();

    @Override
    public void performBehavior() {
        fly();
    }

    @Override
    public String getKey() {
        return FlyBaseBehavior.class.getSimpleName();
    }
}
