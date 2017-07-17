/**
 * Created by michelhayman on 7/17/17.
 */
public class Warrior extends GameCharacter{

    private String weaponType;

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }


    public Warrior(String name, int strength, int intelligence, String weaponType) {
        super(name, strength, intelligence);
        this.weaponType = weaponType;
    }

    @Override
    public void Play() {
        super.Play();
        System.out.println("Weapon: " + weaponType );
        System.out.println( );
    }
}
