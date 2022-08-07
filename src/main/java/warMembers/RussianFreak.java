package warMembers;

public class RussianFreak {
    private String name;
    private int health;

    public RussianFreak(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void takeDemage(int demage){
        if (isAlive() && health <= demage) {
            health = 0;
            System.out.println(getName() + " is dead.");
        } else {
            this.health -= Math.min(health, demage);
            System.out.println(name + " took damage of " + demage + ". Health remains: " + health);
        }

    }

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
