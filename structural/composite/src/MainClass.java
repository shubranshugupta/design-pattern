import filesystem.*;

public class MainClass {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory home = new Directory("home");
        Directory user1 = new Directory("user1");
        Directory user2 = new Directory("user2");

        File file1 = new File("file1.txt", 35);
        File file2 = new File("file2.txt", 43);
        File file3 = new File("file3.txt", 10);
        File file4 = new File("file4.txt", 5);
        File file5 = new File("file5.txt", 15);
        File file6 = new File("file6.txt", 20);

        root.add(home);
        home.add(file1);
        home.add(user1);
        home.add(user2);
        user1.add(file2);
        user1.add(file3);
        user2.add(file4);
        user2.add(file5);
        user2.add(file6);

        System.out.println(root);
    }
}