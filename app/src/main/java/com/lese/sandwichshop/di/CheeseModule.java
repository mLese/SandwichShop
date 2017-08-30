package com.lese.sandwichshop.di;

import com.lese.sandwichshop.cheese.Cheese;
import com.lese.sandwichshop.cheese.Provolone;

import dagger.Module;
import dagger.Provides;

/**
 * Created by deceax on 8/30/2017.
 */

@Module
public class CheeseModule {

    public CheeseModule(){}

    @Provides
    Cheese provideCheese() {
        return new Provolone();
    }
}
