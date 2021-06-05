import java.util.Objects;

public class IceCreamFactory {
    private String ingredient;
    private double totalIceCream;
    private int numOfStores;

    public IceCreamFactory(String ingredient, double totalIceCream, int numOfStores) {
        this.ingredient = ingredient;
        this.totalIceCream = totalIceCream;
        this.numOfStores = numOfStores;
    }

    private String getIngredient() {
        return ingredient;
    }

    private double getTotalIceCream() {
        return totalIceCream;
    }

    private int getNumOfStores() {
        return numOfStores;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public void setTotalIceCream(double totalIceCream) {
        this.totalIceCream = totalIceCream;
    }

    public void setNumOfStores(int numOfStores) {
        this.numOfStores = numOfStores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IceCreamFactory)) return false;
        IceCreamFactory that = (IceCreamFactory) o;
        return Double.compare(that.getTotalIceCream(), getTotalIceCream()) == 0 && getNumOfStores() == that.getNumOfStores() && Objects.equals(getIngredient(), that.getIngredient());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIngredient(), getTotalIceCream(), getNumOfStores());
    }

    @Override
    public String toString() {
        return "IceCreamFactory{" +
                "ingredient='" + ingredient + '\'' +
                ", totalIceCream=" + totalIceCream +
                ", numOfStores=" + numOfStores +
                '}';
    }
}
