package data;

import java.io.*;

public class FileSource implements DataSource {
    private String filename;

    public FileSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        File file = new File(filename);
        // write data to file
        try (OutputStream os = new FileOutputStream(file)) {
            os.write(data.getBytes(), 0, data.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String readData() {
        File file = new File(filename);
        // read data from file
        try (InputStream is = new FileInputStream(file)) {
            byte[] data = new byte[(int) file.length()];
            is.read(data);
            return new String(data);
        } catch (IOException e) {
            return null;
        }
    }
}
