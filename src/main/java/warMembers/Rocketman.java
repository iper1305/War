package warMembers;

import weapons.RocketWeapons;

public class Rocketman<T extends RocketWeapons> extends UkrainianSoldier<T> {
    public Rocketman(String name, T weapon) {
        super(name, weapon);
    }

    @Override
    public void attackRussians(RussianFreak russianFreak) {
        System.out.println(getName() + " shot from a Javelin in " + russianFreak.getName() + ".");
        russianFreak.takeDemage(getWeapon().getDamage());
    }
}
