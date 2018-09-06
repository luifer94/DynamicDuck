package com.luifer.dynamicduck.models.behaviors.base;

public abstract class QuackBaseBehavior implements BaseBehavior {
    public abstract void quack();


    @Override
    public void performBehavior() {
        quack();
    }

    @Override
    public String getKey() {
        return QuackBaseBehavior.class.getSimpleName();
    }
}
