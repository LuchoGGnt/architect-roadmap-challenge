package semana1;

import java.io.File;
import java.io.IOException;

public class Files {
    public static void main(String[] args) {
//        File file = new File("D:\\proyectos-personales\\arq-roadmap\\java-fundamentals\\RefreshJava\\src\\files\\users.txt");
//        try {
//            if (file.createNewFile()) {
//                System.out.println("El archivo " + file.getName() + " fue creado con éxito.");
//            } else {
//                System.out.println("El archivo ya existe.");
//            }
//        } catch (IOException e) {
//            System.out.println("Ocurrió un error en la creación del archivo");
//            e.printStackTrace();
//        }
    }

    public static void guardarObjetoEnArchivo() {

    }

    public static void newFile(String route, String fileName) {
        File file = new File(route + "\\" + fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("Archivo creado en: " + route);
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al crear el archivo " + fileName);
        }
    }
}
