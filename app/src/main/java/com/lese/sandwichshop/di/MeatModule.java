package com.lese.sandwichshop.di;

import com.lese.sandwichshop.meat.Ham;
import com.lese.sandwichshop.meat.Meat;

import dagger.Module;
import dagger.Provides;

/**
 * Created by deceax on 8/30/2017.
 */

@Module
public class MeatModule {

    @Provides
    Meat provideMeat() {
        return new Ham();
    }
}
