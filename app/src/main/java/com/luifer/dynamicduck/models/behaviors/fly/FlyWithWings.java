package com.luifer.dynamicduck.models.behaviors.fly;

import android.util.Log;

import com.luifer.dynamicduck.Constants;
import com.luifer.dynamicduck.models.behaviors.base.FlyBaseBehavior;

public class FlyWithWings extends FlyBaseBehavior {

    @Override
    public void fly() {
        Log.i(Constants.DUCK, "Hey there!. Look up. I am flying with my wings!!");
    }
}
