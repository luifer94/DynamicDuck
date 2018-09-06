package com.luifer.dynamicduck.models.ducks;

import com.luifer.dynamicduck.models.Animal;
import com.luifer.dynamicduck.models.behaviors.base.FlyBaseBehavior;
import com.luifer.dynamicduck.models.behaviors.base.QuackBaseBehavior;

public class MallardDuck extends Animal {


    @Override
    public void addWhiteListElementBehaviors() {
        super.whiteList.put(FlyBaseBehavior.class.getSimpleName(),FlyBaseBehavior.class.getSimpleName());
        super.whiteList.put(QuackBaseBehavior.class.getSimpleName(),QuackBaseBehavior.class.getSimpleName());
    }
}
