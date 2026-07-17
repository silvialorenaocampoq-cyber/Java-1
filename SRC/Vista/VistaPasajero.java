package Vista;

import Pasajero.pasajero_modelo;
import java.util.Scanner;

public class VistaPasajero {

    public static pasajero_modelo capturar(Scanner sc) {
        System.out.println("DATOS DEL PASAJERO");

        System.out.print("  Cédula   : ");
        String cedula = sc.nextLine().trim();

        System.out.print("  Nombre   : ");
        String nombre = sc.nextLine().trim();

        System.out.print("  Apellido : ");
        String apellido = sc.nextLine().trim();

        return new pasajero_modelo(cedula, nombre, apellido);
    }

    public static void mostrar(pasajero_modelo p) {
        System.out.printf (" Cédula : %-22s ", p.getCedula_pasajero());
        System.out.printf (" Nombre : %-22s ", p.getnombre() + " " + p.getapelido());
    }
}
