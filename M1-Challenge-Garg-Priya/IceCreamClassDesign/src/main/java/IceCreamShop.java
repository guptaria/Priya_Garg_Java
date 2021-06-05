import java.util.Objects;

public class IceCreamShop {
    private String flavor;
    private int numberOfScoops;
    private double priceOfScoop;
    private String coneType;

    public IceCreamShop(String flavor, int numberOfScoops, double priceOfScoop, String coneType) {
        this.flavor = flavor;
        this.numberOfScoops = numberOfScoops;
        this.priceOfScoop = priceOfScoop;
        this.coneType = coneType;
    }

    public int getNumberOfScoops() {
        return numberOfScoops;
    }

    public String getFlavor() {
        return flavor;
    }

    public int addScoop() {
        numberOfScoops = numberOfScoops + 1;
        return numberOfScoops;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setNumberOfScoops(int numberOfScoops) {
        this.numberOfScoops = numberOfScoops;
    }

    public double getPriceOfScoop() {
        return priceOfScoop;
    }

    public void setPriceOfScoop(double priceOfScoop) {
        this.priceOfScoop = priceOfScoop;
    }

    public String getConeType() {
        return coneType;
    }

    public void setConeType(String coneType) {
        this.coneType = coneType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IceCreamShop)) return false;
        IceCreamShop that = (IceCreamShop) o;
        return getNumberOfScoops() == that.getNumberOfScoops() && Double.compare(that.getPriceOfScoop(), getPriceOfScoop()) == 0 && Objects.equals(getFlavor(), that.getFlavor()) && Objects.equals(getConeType(), that.getConeType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlavor(), getNumberOfScoops(), getPriceOfScoop(), getConeType());
    }

    @Override
    public String toString() {
        return "IceCreamShop{" +
                "flavor='" + flavor + '\'' +
                ", numberOfScoops=" + numberOfScoops +
                ", priceOfScoop=" + priceOfScoop +
                ", coneType='" + coneType + '\'' +
                '}';
    }
}
