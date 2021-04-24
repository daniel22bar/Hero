package hero_factory;

import entities.Hero;

import java.util.HashMap;
import java.util.Map;


public class HeroCreatorSingleton {
    private static HeroCreatorSingleton instance;
    private Map<Integer, HeroFactory> map;

    private HeroCreatorSingleton() {
        map = new HashMap<Integer, HeroFactory>();
        map.put(0, new ElfFactory());
        map.put(1, new HobbitFactory());
        map.put(2, new KingFactory());
        map.put(3, new KnightFactory());
    }

    public static HeroCreatorSingleton getInstance() {
        if(instance == null) {
            instance = new HeroCreatorSingleton();
        }
        return instance;
    }

    public Hero create(int index) {
        return map.get(index).createHero();
    }

}
