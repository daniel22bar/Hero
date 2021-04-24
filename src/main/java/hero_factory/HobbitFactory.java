package hero_factory;

import entities.Hero;
import entities.Hobbit;

class HobbitFactory implements HeroFactory{
    @Override
    public Hero createHero() {
        return new Hobbit();
    }
}
