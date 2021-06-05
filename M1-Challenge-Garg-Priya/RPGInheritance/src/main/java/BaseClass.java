import java.util.Objects;

public class BaseClass {
    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;

    public BaseClass(String name, int strength, int health, int stamina, int speed, int attackPower) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseClass)) return false;
        BaseClass baseClass = (BaseClass) o;
        return getStrength() == baseClass.getStrength() && getHealth() == baseClass.getHealth() && getStamina() == baseClass.getStamina() && getSpeed() == baseClass.getSpeed() && getAttackPower() == baseClass.getAttackPower() && Objects.equals(getName(), baseClass.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getStrength(), getHealth(), getStamina(), getSpeed(), getAttackPower());
    }

    @Override
    public String toString() {
        return "BaseClass{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                '}';
    }
}
