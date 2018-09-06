package com.luifer.dynamicduck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.luifer.dynamicduck.models.behaviors.base.FlyBaseBehavior;
import com.luifer.dynamicduck.models.behaviors.fly.FlyNoWay;
import com.luifer.dynamicduck.models.behaviors.fly.FlyWithWings;
import com.luifer.dynamicduck.models.behaviors.kill.KillingBehavior;
import com.luifer.dynamicduck.models.behaviors.quack.NormalQuack;
import com.luifer.dynamicduck.models.behaviors.quack.OddQuack;
import com.luifer.dynamicduck.models.ducks.MallardDuck;
import com.luifer.dynamicduck.models.ducks.ReheadDuck;
import com.luifer.dynamicduck.models.monsters.Godzilla;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.putAnimalBehavior(new FlyWithWings());

        mallardDuck.putAnimalBehavior(new FlyNoWay());
        mallardDuck.putAnimalBehavior(new NormalQuack());


        ReheadDuck reheadDuck = new ReheadDuck();
        reheadDuck.putAnimalBehavior(new FlyNoWay());
        reheadDuck.putAnimalBehavior(new OddQuack());
        mallardDuck.putAnimalBehavior(new NormalQuack());

        Godzilla godzilla = new Godzilla();
        godzilla.putAnimalBehavior(new KillingBehavior());


        //You can play all their behaviors at once
        Arrays.asList(godzilla, reheadDuck, mallardDuck).forEach(item -> {
            item.play();
        });

        /// Or perform the desired behavior if it has been added
        mallardDuck.performBehavior(FlyBaseBehavior.class.getSimpleName());
    }
}
