import java.util.Objects;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;
    private Address shippingAddress;
    private Address billingAddress;
    private boolean rewardCustomer;

    public Customer(String firstName, String lastName, String email, int phoneNumber, Address shippingAddress, Address billingAddress, boolean rewardCustomer) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.rewardCustomer = rewardCustomer;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public boolean isRewardCustomer() {
        return rewardCustomer;
    }

    public void setRewardCustomer(boolean rewardCustomer) {
        this.rewardCustomer = rewardCustomer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return getPhoneNumber() == customer.getPhoneNumber() && isRewardCustomer() == customer.isRewardCustomer() && Objects.equals(getFirstName(), customer.getFirstName()) && Objects.equals(getLastName(), customer.getLastName()) && Objects.equals(getEmail(), customer.getEmail()) && Objects.equals(getShippingAddress(), customer.getShippingAddress()) && Objects.equals(getBillingAddress(), customer.getBillingAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getEmail(), getPhoneNumber(), getShippingAddress(), getBillingAddress(), isRewardCustomer());
    }
}
