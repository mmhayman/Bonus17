import java.util.ArrayList;

/**
 * Created by michelhayman on 7/17/17.
 */
public class Main {

    public static void main(String[] args) {


        Warrior one = new Warrior("Chuck", 7, 1, "Hammer");
        Warrior two = new Warrior("Harry", 1, 8, "Gun");
        Wizard three = new Wizard("Skylar", 2, 10, 3, 8);
        Wizard four = new Wizard("Rob", 6, 3, 15, 30);
        Wizard five = new Wizard("Tom", 9, 6, 30, 50);

        ArrayList<GameCharacter> gameCharacters = new ArrayList<GameCharacter>( );

        gameCharacters.add(one);
        gameCharacters.add(two);
        gameCharacters.add(three);
        gameCharacters.add(four);
        gameCharacters.add(five);


        for (GameCharacter game: gameCharacters) {
            game.Play();
        }
    }
}
