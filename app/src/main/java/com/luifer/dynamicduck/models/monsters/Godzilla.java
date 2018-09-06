package com.luifer.dynamicduck.models.monsters;

import com.luifer.dynamicduck.models.Animal;
import com.luifer.dynamicduck.models.behaviors.base.KillBaseBehavior;

public class Godzilla extends Animal {

    @Override
    public void addWhiteListElementBehaviors() {
        super.whiteList.put(KillBaseBehavior.class.getSimpleName(), KillBaseBehavior.class.getSimpleName());
    }
}
