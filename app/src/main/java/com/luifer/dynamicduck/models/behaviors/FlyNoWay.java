package com.luifer.dynamicduck.models.behaviors;

import android.util.Log;

import com.luifer.dynamicduck.Constants;
import com.luifer.dynamicduck.models.behaviors.base.FlyBehavior;

public class FlyNoWay extends FlyBehavior {

    @Override
    public void fly() {
        Log.i(Constants.DUCK,"Hey there!. I cannot fly");
    }

}
