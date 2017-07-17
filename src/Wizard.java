/**
 * Created by michelhayman on 7/17/17.
 */
public class Wizard extends MagicUsingCharacter {

    private int spellNumber;


    public int getSpellNumber() {
        return spellNumber;
    }

    public void setSpellNumber(int spellNumber) {
        this.spellNumber = spellNumber;
    }


    public Wizard(String name, int strength, int intelligence, int magicalEnergy, int spellNumber) {
        super(name, strength, intelligence, magicalEnergy);
        this.spellNumber = spellNumber;
    }

    @Override
    public void Play() {
        super.Play( );
        System.out.println("Number of spells: " + spellNumber );
        System.out.println( );
    }

}
