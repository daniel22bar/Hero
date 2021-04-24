package entities;

import java.sql.SQLOutput;

public class Hobbit extends Hero {

    public Hobbit (){
        this.setPower(0);
        this.setHp(3);
    }
    @Override
    public void kick(Hero hero) {
        toCry();
    }

    private void toCry() {
        System.out.println("cry");
    }
}
