package com.luifer.dynamicduck.models.behaviors.quack;

import android.util.Log;

import com.luifer.dynamicduck.Constants;
import com.luifer.dynamicduck.models.behaviors.base.QuackBaseBehavior;

public class NormalQuack extends QuackBaseBehavior {

    @Override
    public void quack() {
        Log.i(Constants.DUCK, "Quack");
    }
}
