package hero_factory;

import entities.Elf;
import entities.Hero;

class ElfFactory implements HeroFactory{
    @Override
    public Hero createHero() {
        return new Elf();
    }
}
