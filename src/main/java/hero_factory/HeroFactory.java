package hero_factory;

import entities.*;
import entities.Hero;
import lombok.SneakyThrows;

import java.util.Random;

public interface HeroFactory {
    public Hero createHero();
}
