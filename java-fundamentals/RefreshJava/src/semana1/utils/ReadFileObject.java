package semana1.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadFileObject {
    private FileInputStream file;
    private ObjectInputStream stream;

    public ReadFileObject(String path) {
        try {
            this.file = new FileInputStream(path);
            this.stream = new ObjectInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Object readFile() {
        try {
            return stream.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                file.close();
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
