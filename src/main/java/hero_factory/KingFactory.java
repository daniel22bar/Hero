package hero_factory;

import entities.Hero;
import entities.King;

public class KingFactory implements HeroFactory{
    @Override
    public Hero createHero() {
        return new King();
    }
}
