package com.luifer.dynamicduck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.luifer.dynamicduck.models.Duck;
import com.luifer.dynamicduck.models.MallardDuck;
import com.luifer.dynamicduck.models.behaviors.FlyNoWay;
import com.luifer.dynamicduck.models.behaviors.FlyWithWings;
import com.luifer.dynamicduck.models.behaviors.base.DuckBehaviorParent;
import com.luifer.dynamicduck.models.behaviors.base.FlyBehavior;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MallardDuck duck = new MallardDuck();
        duck.display();
        duck.swim();
        duck.putDuckBehavior(new FlyWithWings());
        duck.performBehavior(FlyBehavior.class.getSimpleName());
        duck.putDuckBehavior(new FlyNoWay());

    }
}
