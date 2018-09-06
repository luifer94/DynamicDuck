package com.luifer.dynamicduck.models.behaviors.kill;

import android.util.Log;

import com.luifer.dynamicduck.Constants;
import com.luifer.dynamicduck.models.behaviors.base.KillBaseBehavior;

public class KillingBehavior extends KillBaseBehavior {

    @Override
    public void kill() {
        Log.i(Constants.DUCK,"Run!! because I gonna kill you!!!!!! Ja Ja Ja");
    }
}
