public class User {
    private UserType userType;
    private String username;
    private String email;
    private String password;
    private Address address;
    private int age;
    private char gender;

    public User(UserBuilder builder) {
        this.userType = builder.userType;
        this.username = builder.username;
        this.email = builder.email;
        this.password = builder.password;
        this.address = builder.address;
        this.age = builder.age;
        this.gender = builder.gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "userType='" + userType + "'" +
                ", username='" + username + "'" +
                ", email='" + email + "'" +
                ", password='" + password + "'" +
                ", address=" + address.toString() +
                ", age=" + age + "'" +
                ", gender=" + gender + "}";
    }
}
