package com.luifer.dynamicduck.models.behaviors.base;

public abstract class QuackBehavior implements DuckBehaviorParent {
    public abstract void quack();


    @Override
    public void performBehavior() {
        quack();
    }

    @Override
    public String getKey() {
        return QuackBehavior.class.getSimpleName();
    }
}
