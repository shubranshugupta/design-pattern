package data;

import java.util.Random;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encrypt(data));
    }

    @Override
    public String readData() {
        return decrypt(super.readData());
    }

    private String encrypt(String data) {
        // encrypt data
        Random rand = new Random();
        int min = 1, max = 9;
        int randNum = rand.nextInt(max - min + 1) + min;
        for (int i = 0; i < data.length(); i++) {
            data = data.substring(0, i) + (char) (data.charAt(i) + randNum) + data.substring(i + 1);
        }

        return randNum + data;
    }

    private String decrypt(String data) {
        // decrypt data
        int randNum = Integer.parseInt(data.substring(0, 1));
        data = data.substring(1);
        for (int i = 0; i < data.length(); i++) {
            data = data.substring(0, i) + (char) (data.charAt(i) - randNum) + data.substring(i + 1);
        }

        return data;
    }
}
