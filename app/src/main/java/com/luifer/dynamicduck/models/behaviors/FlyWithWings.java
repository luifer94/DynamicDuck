package com.luifer.dynamicduck.models.behaviors;

import android.util.Log;

import com.luifer.dynamicduck.Constants;
import com.luifer.dynamicduck.models.behaviors.base.FlyBehavior;

public class FlyWithWings extends FlyBehavior {

    @Override
    public void fly() {
        Log.i(Constants.DUCK, "Hey there!. Look up. I am flying with my wings!!");
    }
}
