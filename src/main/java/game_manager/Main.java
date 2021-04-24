package game_manager;

import hero_factory.*;
import random_singleton.RandomSingleton;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer, HeroFactory> heroDictionary = new HashMap<Integer, HeroFactory>();
        heroDictionary.put(0, new ElfFactory());
        heroDictionary.put(1, new HobbitFactory());
        heroDictionary.put(2, new KingFactory());
        heroDictionary.put(3, new KnightFactory());

        int random1 = RandomSingleton.getInstance().nextInt(0,3);
        int random2 = RandomSingleton.getInstance().nextInt(0,3);

        GameManager.fight(heroDictionary.get(random1).createHero(),
                          heroDictionary.get(random2).createHero());

    }
}
