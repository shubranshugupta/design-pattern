public class MainClass {
    public static void main(String[] args) throws Exception {
        UserBuilder userBuilder = new UserBuilder();
        Director director = new Director();

        director.createRegularUser(userBuilder);
        User regularUser = userBuilder.build();
        System.out.println(regularUser);

        director.createAdminUser(userBuilder);
        User adminUser = userBuilder.build();
        System.out.println(adminUser);
    }
}
