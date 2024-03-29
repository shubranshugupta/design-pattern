public class UserBuilder {
    UserType userType;
    String username;
    String email;
    String password;
    Address address;
    int age;
    char gender;

    public UserBuilder setUserType(UserType userType) {
        this.userType = userType;
        return this;
    }

    public UserBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public UserBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserBuilder setAddress(Address address) {
        this.address = address;
        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder setGender(char gender) {
        if (gender == 'M' || gender == 'F')
            this.gender = gender;
        else
            this.gender = 'U';
        return this;
    }

    public User build() {
        return new User(this);
    }
}
