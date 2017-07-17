import java.util.ArrayList;

/**
 * Created by michelhayman on 7/17/17.
 */
public abstract class GameCharacter {

    private String name;
    private int strength;
    private int intelligence;

    public GameCharacter(String name, int strength, int intelligence) {
        this.name = name;
        this.strength = strength;
        this.intelligence = intelligence;
    }


    public static void main(String[] args) {


        Warrior one = new Warrior("Chuck", 7, 1, "Hammer");
        Warrior two = new Warrior("Harry", 1, 8, "Gun");
        Wizard three = new Wizard("Skylar", 2, 10, 3, 8);
        Wizard four = new Wizard("Rob", 6, 3, 1, 7);
        Wizard five = new Wizard("Tom", 9, 6, 9, 5);

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void Play () {
        System.out.println("Name: " + name );
        System.out.println("Strength:" + strength );
        System.out.println("Intelligence: " + intelligence );

    }

}


