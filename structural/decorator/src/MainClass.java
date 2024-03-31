import data.*;

public class MainClass {
    public static void main(String[] args) {
        DataSource source = new CompressDecorator(
                new EncryptionDecorator(new FileSource("data.txt")));

        source.writeData("Hello, World!");
        System.out.println(source.readData());
    }
}
