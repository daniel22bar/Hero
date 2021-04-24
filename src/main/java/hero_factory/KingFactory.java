package hero_factory;

import entities.Hero;
import entities.King;

class KingFactory implements HeroFactory{
    @Override
    public Hero createHero() {
        return new King();
    }
}
