package warMembers;

import weapons.MilitaryHardware;

public class Tanker<T extends MilitaryHardware> extends UkrainianSoldier<T> {
    public Tanker(String name, T weapon) {
        super(name, weapon);
    }

    @Override
    public void attackRussians (RussianFreak russianFreak){
        System.out.println(getName() + " run over with a tank on " + russianFreak.getName() + ".");
        russianFreak.takeDemage(getWeapon().getDamage());
    }
}
