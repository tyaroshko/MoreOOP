package lotr;

public class Elf extends Character{
    public Elf() {
        super(10, 10);
    }
    @Override
    public void kick(Character c) {
        if (c.getHp() < this.getHp()) {
            c.setHp(0);
            System.out.println("");
        }
        else {
            c.setPower(c.getPower() - 1);
        }
    }
}
