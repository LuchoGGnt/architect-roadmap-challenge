package semana1.features;

import semana1.entities.user.User;

import java.util.Scanner;

public class FUser {
    public static void requisitosUsuario() {
        System.out.print("""
                \nRequisitos para crear un usuario:
                                
                - Nombre(s)
                - Apellido(s)
                - DNI
                - Edad en años
                - Dirección
                - Salario
                                
                1. Continuar
                2. Regresar
                                
                Opción: 
                """);
    }

    public static User crearUsuario() {
        Scanner scanner = new Scanner(System.in);

        User usuario;

        try {
            System.out.print("\nNombre(s): ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido(s): ");
            String apellido = scanner.nextLine();
            System.out.print("DNI: ");
            String dni = scanner.nextLine();
            System.out.print("Edad en años: ");
            int edad = Integer.parseInt(scanner.nextLine());
            System.out.print("Dirección: ");
            String direccion = scanner.nextLine();
            System.out.print("Salario en soles: ");
            double salario = Double.parseDouble(scanner.nextLine());

            return usuario = new User(nombre, apellido, edad, dni, direccion, salario);
        } catch (Exception e) {
            System.out.println("Ocurrió un error al crear el usuario.");
            e.getMessage();
        }
        return null;
    }
    public static User usuarioDummy() {
        User usuario;
        return usuario = new User(
                "Luis",
                "Sánchez",
                23,
                "12345678",
                "SJM",
                15948.0
        );
    }
}
