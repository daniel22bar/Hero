package hero_factory;

import entities.Hero;
import entities.Knight;

public class KnightFactory implements HeroFactory{
    @Override
    public Hero createHero() {
        return new Knight();
    }
}
