package com.luifer.dynamicduck.models;

import android.util.Log;

import com.luifer.dynamicduck.Constants;
import com.luifer.dynamicduck.models.behaviors.base.DuckBehaviorParent;

import java.util.HashMap;

public abstract class Duck {

    private HashMap<String, DuckBehaviorParent> duckBehaviors;

    public Duck() {
        this.duckBehaviors = new HashMap<String, DuckBehaviorParent>();
    }

    public abstract void swim();

    public abstract void display();


    public void putDuckBehavior(DuckBehaviorParent duckBehaviorParent) {
        String keyDuckBehavior = duckBehaviorParent.getKey();
        if (hasBehavior(keyDuckBehavior) == null)
            this.duckBehaviors.put(duckBehaviorParent.getKey(), duckBehaviorParent);
    }


    public void removeDuckBehavior(DuckBehaviorParent duckBehaviorParent) {
        this.duckBehaviors.remove(duckBehaviorParent.getKey());
    }


    public DuckBehaviorParent hasBehavior(String keyDuckBehavior) {

        return this.duckBehaviors.containsKey(keyDuckBehavior) ? this.duckBehaviors.get(keyDuckBehavior) : null;
    }


    public void performBehavior(String keyDuckBehavior) {
        DuckBehaviorParent duckBehaviorParent = hasBehavior(keyDuckBehavior);
        if (duckBehaviorParent != null) {
            duckBehaviorParent.performBehavior();
        } else {
            Log.i(Constants.DUCK, "No duck behavior put in!");
        }
    }


}
