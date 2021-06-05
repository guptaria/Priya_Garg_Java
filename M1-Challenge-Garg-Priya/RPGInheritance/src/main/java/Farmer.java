public class Farmer extends BaseClass {
    public Farmer(String name, int strength, int health, int stamina, int speed, int attackPower) {
        super("PriyaFarmer",75,100,75,10,1);
    }

    public void plow() {
        System.out.println("This is the plow method of farmer class");
    }

    public void harvest() {
        System.out.println("This is the harvest method of farmer class");
    }

}
