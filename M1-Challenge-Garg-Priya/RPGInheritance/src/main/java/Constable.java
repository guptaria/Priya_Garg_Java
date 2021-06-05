import java.util.Objects;

public class Constable extends BaseClass{
    private  String jurisdiction;
    public Constable(String name, int strength, int health, int stamina, int speed, int attackPower, String jurisdiction) {
        super("PriyaConstable",60,100,60,20,5);
        this.jurisdiction = "Law";
    }
    public void arrest(){
        System.out.println("This is the arrest method of Constable class");
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Constable)) return false;
        if (!super.equals(o)) return false;
        Constable constable = (Constable) o;
        return Objects.equals(getJurisdiction(), constable.getJurisdiction());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getJurisdiction());
    }

    @Override
    public String toString() {
        return "Constable{" +
                "jurisdiction='" + jurisdiction + '\'' +
                '}';
    }
}
