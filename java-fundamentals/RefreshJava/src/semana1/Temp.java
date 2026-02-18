package semana1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Temp {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            list.add(Math.random());
        }

        for (int i = 0; i < 50; i++) {
            System.out.println(list.get(i));
        }
    }
}
