package lotr;

import java.util.Random;

public abstract class Noble extends Character{
    private static final Random random = new Random();

    public Noble(int minPower, int maxPower, int minHp, int maxHp) {
        super(random.nextInt(maxPower - minPower + 1) + minHp, random.nextInt(maxHp - minHp + 1) + minPower);
    }

    @Override
    public void kick(Character c) {
        int damage = (int) (random.nextDouble() * getPower());
        c.setHp(c.getHp() - damage);
    }
}
