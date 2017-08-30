package com.lese.sandwichshop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.lese.sandwichshop.bread.Bread;
import com.lese.sandwichshop.cheese.Cheese;
import com.lese.sandwichshop.di.DaggerSandwichComponent;
import com.lese.sandwichshop.di.SandwichComponent;
import com.lese.sandwichshop.meat.Meat;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Bread bread;

    @Inject
    Cheese cheese;

    @Inject
    Meat meat;

    TextView breadView;
    TextView cheeseView;
    TextView meatView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        breadView = (TextView) findViewById(R.id.bread);
        cheeseView = (TextView) findViewById(R.id.cheese);
        meatView = (TextView) findViewById(R.id.meat);

        SandwichComponent component = DaggerSandwichComponent.builder().build();
        component.inject(this);

        breadView.setText(bread.getBreadName());
        cheeseView.setText(cheese.getCheeseName());
        meatView.setText(meat.getMeatName());
    }
}
