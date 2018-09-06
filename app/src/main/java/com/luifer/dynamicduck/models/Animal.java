package com.luifer.dynamicduck.models;

import android.util.Log;

import com.luifer.dynamicduck.Constants;
import com.luifer.dynamicduck.models.behaviors.base.BaseBehavior;

import java.util.HashMap;

public abstract class Animal {

    private HashMap<String, BaseBehavior> animalBehaviors;
    protected HashMap<String, String> whiteList ;

    public Animal() {
        animalBehaviors = new HashMap<String, BaseBehavior>();
        whiteList = new HashMap<String, String>();
    }

    public abstract void addWhiteListElementBehaviors();

    public void putAnimalBehavior(BaseBehavior baseBehavior) {
        String keyAnimalBehavior = baseBehavior.getKey();
        if (hasBehavior(keyAnimalBehavior) == null && isInWhiteList(baseBehavior.getKey()))
            this.animalBehaviors.put(baseBehavior.getKey(), baseBehavior);
    }


    public void removeAnimalBehavior(BaseBehavior baseBehavior) {
        this.animalBehaviors.remove(baseBehavior.getKey());
    }


    public BaseBehavior hasBehavior(String keyAnimalBehavior) {

        return this.animalBehaviors.containsKey(keyAnimalBehavior) ? this.animalBehaviors.get(keyAnimalBehavior) : null;
    }

    public boolean isInWhiteList(String keyBehavior) {
        //return true statement is set to true because due the specifications we want a dynamics
        if (whiteList == null || whiteList.isEmpty()) return true;
        return whiteList.containsKey(keyBehavior);
    }


    public void performBehavior(String keyAnimalBehavior) {
        BaseBehavior baseBehavior = hasBehavior(keyAnimalBehavior);
        if (baseBehavior != null) {
            baseBehavior.performBehavior();
        } else {
            Log.i(Constants.DUCK, "No behavior put in!");
        }
    }

    public void play() {
        this.animalBehaviors.forEach((k, v) -> v.performBehavior());
    }
}
