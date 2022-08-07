package warMembers;

import weapons.ArtilleryWeapons;

public class Artilleryman<T extends ArtilleryWeapons> extends UkrainianSoldier<T> {
    public Artilleryman(String name, T weapon) {
        super(name, weapon);
    }

    @Override
    public void attackRussians(RussianFreak russianFreak) {
        System.out.println(getName() + " fired from a howitzer in " + russianFreak.getName() + ".");
        russianFreak.takeDemage(getWeapon().getDamage());
    }
}
