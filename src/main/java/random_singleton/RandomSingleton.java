package random_singleton;

import java.util.Random;

public class RandomSingleton {
    private static RandomSingleton instance;
    private Random rnd;

    private RandomSingleton() {
        rnd = new Random();
    }

    public static RandomSingleton getInstance() {
        if(instance == null) {
            instance = new RandomSingleton();
        }
        return instance;
    }

    public int nextInt(int from , int to) {
        return rnd.nextInt(to - from) + from ;
    }

}