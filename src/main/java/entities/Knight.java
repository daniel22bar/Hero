package entities;

import random_singleton.RandomSingleton;

import java.util.Random;

public class Knight extends Kings {
    public Knight() {
        setPower(RandomSingleton.getInstance().nextInt(2,12));
        setHp(RandomSingleton.getInstance().nextInt(2,12));
    }
}