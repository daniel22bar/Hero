package hero_factory;

import entities.Elf;
import entities.Hero;

public class ElfFactory implements HeroFactory{
    @Override
    public Hero createHero() {
        return new Elf();
    }
}
