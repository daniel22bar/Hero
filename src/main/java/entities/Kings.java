package entities;

import random_singleton.RandomSingleton;

import java.util.Random;

public abstract class Kings extends Hero{
    @Override
    public void kick(Hero hero) {
        hero.setHp(hero.getHp() - (RandomSingleton.getInstance().nextInt(0,getPower())));
    }
}
