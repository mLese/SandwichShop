package com.lese.sandwichshop.di;

import com.lese.sandwichshop.bread.Bread;
import com.lese.sandwichshop.bread.Sourdough;

import dagger.Module;
import dagger.Provides;

/**
 * Created by deceax on 8/30/2017.
 */

@Module
public class BreadModule {

    @Provides
    Bread provideBread() {
        return new Sourdough();
    }
}
