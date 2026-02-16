package semana1.utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteFileObject {
    private FileOutputStream file;
    private ObjectOutputStream stream;

    public WriteFileObject(String path, Object o) {
        try {
            this.file = new FileOutputStream(path);
            this.stream = new ObjectOutputStream(file);
            stream.writeObject(o);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
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
