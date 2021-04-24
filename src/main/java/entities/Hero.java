package entities;

public abstract class Hero {
    private int power;
    private int hp;

    public Hero() {
    }

    public abstract void kick(Hero hero);

    public boolean isAlive(){
       return this.hp > 0 ?  true :  false;
    }

    public String toString() {
        return this.getClass().getName() + " has a hp of: " + getHp() + ", and power of: " + getPower();
    }

    public int getPower() {
        return this.power;
    }

    public int getHp() {
        return this.hp;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Hero)) return false;
        final Hero other = (Hero) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getPower() != other.getPower()) return false;
        if (this.getHp() != other.getHp()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Hero;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getPower();
        result = result * PRIME + this.getHp();
        return result;
    }
}
