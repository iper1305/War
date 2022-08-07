package warMembers;

import weapons.Weapons;

public abstract class UkrainianSoldier<T extends Weapons> {
    private String name;
    private T weapon;
    public UkrainianSoldier(String name, T  weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public abstract void attackRussians(RussianFreak russianFreak);

    public String getName() {
        return name;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }
}
