package Vista;

import Chofer.chofer_modelo;
import java.util.Scanner;

public class VistaChofer {

    public static chofer_modelo capturar(Scanner sc) {
        System.out.println("DATOS DEL CHOFER");

        System.out.print("  Cédula           : ");
        String cedula = sc.nextLine().trim();

        System.out.print("  Nombre           : ");
        String nombre = sc.nextLine().trim();

        System.out.print("  Apellido         : ");
        String apellido = sc.nextLine().trim();

        System.out.print("  Número Licencia  : ");
        String licencia = sc.nextLine().trim();

        return new chofer_modelo(cedula, nombre, apellido, licencia);
    }

    public static void mostrar(chofer_modelo c) {
        System.out.printf ("Cédula   : %-20s", c.getCedula_chofer());
        System.out.printf ("Nombre   : %-20s", c.getNombre_chofer() + " " + c.getApellido_chofer());
        System.out.printf ("Licencia : %-20s", c.getLicencia());
    }
}
