public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + "'" +
                ", city='" + city + "'" +
                ", state='" + state + "'" +
                ", zipCode='" + zipCode + "'}";
    }

}
