package entities;

public class Elf extends Hero{

    public Elf(){
        this.setPower(10);
        this.setHp(10);
    }
    @Override
    public void kick(Hero hero) {
        if(this.getPower() > hero.getPower())
            hero.setHp(0);
        else
            hero.setPower(hero.getPower() -1 );
    }
}
