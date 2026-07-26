package Vista;

import java.util.Scanner;

public class VistaPasajero {

    public static String pedirCedula(Scanner sc) {
        System.out.print("  Cedula   : ");
        return sc.nextLine().trim();
    }

    public static String pedirNombre(Scanner sc) {
        System.out.print("  Nombre   : ");
        return sc.nextLine().trim();
    }

    public static String pedirApellido(Scanner sc) {
        System.out.print("  Apellido : ");
        return sc.nextLine().trim();
    }

    public static void encabezado() {
        System.out.println("DATOS DEL PASAJERO");
    }
}
