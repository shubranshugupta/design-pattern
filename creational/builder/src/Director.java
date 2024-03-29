public class Director {

    public void createRegularUser(UserBuilder userBuilder) {
        userBuilder.setUserType(UserType.REGULAR);
        userBuilder.setUsername("regularUser1");
        userBuilder.setEmail("regularuser@email.com");
        userBuilder.setPassword("password");
        userBuilder.setAddress(
                new Address(
                        "street 123",
                        "Mumbai",
                        "Maharashtra",
                        "400001"));
        userBuilder.setAge(25);
        userBuilder.setGender('M');
    }

    public void createAdminUser(UserBuilder userBuilder) {
        userBuilder.setUserType(UserType.ADMIN);
        userBuilder.setUsername("adminUser1");
        userBuilder.setEmail("adminuser@email.com");
        userBuilder.setPassword("passwordAdmin");
        userBuilder.setAddress(
                new Address(
                        "street 456",
                        "Pune",
                        "Maharashtra",
                        "411001"));
        userBuilder.setAge(30);
        userBuilder.setGender('M');
    }

}
