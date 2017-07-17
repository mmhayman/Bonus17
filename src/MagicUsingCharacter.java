/**
 * Created by michelhayman on 7/17/17.
 */
public class MagicUsingCharacter extends GameCharacter {

    private int magicalEnergy;



    public int getMagicalEnergy() {
        return magicalEnergy;
    }

    public void setMagicalEnergy(int magicalEnergy) {
        this.magicalEnergy = magicalEnergy;
    }


    public MagicUsingCharacter(String name, int strength, int intelligence, int magicalEnergy) {
        super(name, strength, intelligence);
        this.magicalEnergy = magicalEnergy;
    }

    @Override
    public void Play() {
        super.Play();
        System.out.println("Magical Energy: " + magicalEnergy);
    }
}
