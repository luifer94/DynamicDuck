package com.luifer.dynamicduck.models.behaviors.base;


public abstract class FlyBehavior implements DuckBehaviorParent {

    public abstract void fly();

    @Override
    public void performBehavior() {
        fly();
    }

    @Override
    public String getKey() {
        return FlyBehavior.class.getSimpleName();
    }
}
