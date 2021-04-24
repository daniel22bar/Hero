package game_manager;

import hero_factory.*;
import random_singleton.RandomSingleton;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int random1 = RandomSingleton.getInstance().nextInt(0,3);
        int random2 = RandomSingleton.getInstance().nextInt(0,3);

        GameManager.fight(HeroCreatorSingleton.getInstance().create(random1),
                          HeroCreatorSingleton.getInstance().create(random2));

    }
}
