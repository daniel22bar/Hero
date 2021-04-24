package hero_factory;

import entities.*;
import entities.Hero;
import lombok.SneakyThrows;

import java.util.Random;

interface HeroFactory {
    public Hero createHero();
}
