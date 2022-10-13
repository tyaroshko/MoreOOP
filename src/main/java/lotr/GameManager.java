package lotr;

public class GameManager {
    public void fight(Character character1, Character character2) {
        if ((character1.getClass().getTypeName() == "Elf" && character2.getClass().getTypeName() == "Elf") || (character1.getClass().getTypeName() == "Hobbit" && character2.getClass().getTypeName() == "Hobbit"))
        {
            System.out.println("It's a draw!");
        }
        int round = 0;
        while (character1.getHp() > 0 && character2.getHp() > 0) {
            System.out.println(character1 + " and " + character2 + "are fighting: round " + round);
            character1.kick(character2);
            if (character2.getHp() == 0) {
                System.out.println("First player " + character1 + " won. Congratulations!");
                break;
            }
            character2.kick(character1);
            if (character1.getHp() == 0) {
                System.out.println("Second player " + character2 + " won. Congratulations!");
                break;
            }
            ++round;
        }
    }
}
