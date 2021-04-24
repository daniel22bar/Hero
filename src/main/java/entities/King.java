package entities;

import random_singleton.RandomSingleton;

import java.util.Random;
import java.util.stream.IntStream;

public class King extends Kings{
    public King(){
        this.setPower(RandomSingleton.getInstance().nextInt(5,15));
        this.setHp(RandomSingleton.getInstance().nextInt(5,15));
    }


}
