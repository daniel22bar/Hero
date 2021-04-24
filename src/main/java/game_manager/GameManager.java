package game_manager;

import entities.Hero;
import lombok.experimental.UtilityClass;

@UtilityClass
public class GameManager {
     void fight(Hero h1, Hero h2){
         int counter =0;
        System.out.println("************** new fight ************");
        System.out.println(h1.toString());
        System.out.println(h2.toString());
        System.out.println("************* fight ****************");
        while (h1.isAlive() && h2.isAlive() && counter < 100){
            h1.kick(h2);
            System.out.println(h2.toString());
            if(h2.isAlive()){
                h2.kick(h1);
                System.out.println(h1.toString());
            }
            counter++;
        }
        System.out.println((h1.isAlive()? h1.getClass().getName() : h2.getClass().getName()) + " Win");
    }
}