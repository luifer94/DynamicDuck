package com.luifer.dynamicduck.models.behaviors.base;

public abstract class KillBaseBehavior implements BaseBehavior {

    public abstract void kill();

    @Override
    public void performBehavior() {
        kill();
    }

    @Override
    public String getKey() {
        return KillBaseBehavior.class.getSimpleName();
    }
}
