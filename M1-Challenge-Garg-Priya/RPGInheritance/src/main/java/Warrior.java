import java.util.Objects;

public class Warrior extends BaseClass {
    private int shieldStrength;

    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower, int shieldStrength) {
        super("PriyaWarrior",75,100,100,50,10);
        this.shieldStrength = 100;
    }

    public void decreaseShieldStrength(){
        System.out.println("This is the decreaseShieldStrength method of warrior class");
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Warrior)) return false;
        if (!super.equals(o)) return false;
        Warrior warrior = (Warrior) o;
        return getShieldStrength() == warrior.getShieldStrength();
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), getShieldStrength());
    }
}
