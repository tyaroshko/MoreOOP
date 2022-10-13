package lotr;

public abstract class Character {
    private int power;
    private int hp;

    public Character(int power, int hp) {
        this.setPower(power);
        this.setHp(hp);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
            System.out.println(this.toString() + " is dead");
        } else {
            this.hp = hp;
        }
    }

    public abstract void kick(Character c);

    @Override
    public String toString() {
        return this.getClass().getTypeName() + "{hp=" + this.getHp() + ", power=" + this.getPower() + "}";
    }
}
