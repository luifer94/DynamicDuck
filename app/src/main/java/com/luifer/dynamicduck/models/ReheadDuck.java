package com.luifer.dynamicduck.models;

import android.util.Log;

import com.luifer.dynamicduck.Constants;

public class ReheadDuck extends Duck {

    @Override
    public void swim() {
        Log.i(Constants.DUCK,"Rehead duck swimming action");
    }

    @Override
    public void display() {
        Log.i(Constants.DUCK,"Rehead duck display action");
    }
}
