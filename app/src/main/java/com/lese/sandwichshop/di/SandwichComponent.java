package com.lese.sandwichshop.di;

import com.lese.sandwichshop.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by deceax on 8/30/2017.
 */

@Singleton
@Component(modules={BreadModule.class, CheeseModule.class, MeatModule.class})
public interface SandwichComponent {
    void inject(MainActivity activity);
}
