package com.luifer.dynamicduck.models;

import android.util.Log;

import com.luifer.dynamicduck.Constants;

public class MallardDuck extends Duck {

    @Override
    public void swim() {
        Log.i(Constants.DUCK, "Mallar duck swimming action");
    }

    @Override
    public void display() {
        Log.i(Constants.DUCK, "Mallar duck display action");
    }
}
