import lotr.Character;
import lotr.Elf;
import lotr.Hobbit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElfTest {
    private Character character;

    @BeforeEach
    public void init() {
        character = new Elf();
    }

    @Test
    public void testToString(){ assertEquals(character.toString(), "lotr.Elf{hp=10, power=10}");
    }

    @Test
    public void testKick() {
        Hobbit hobbit = new Hobbit();
        character.kick(hobbit);
        assertEquals(hobbit.getHp(), 0);
    }
}
