package Vista;

import modelo.pasajero_modelo;
import java.util.Scanner;

public class VistaPasajero {

    public static pasajero_modelo capturar(Scanner sc) {
        System.out.println("DATOS DEL PASAJERO");

        String cedula;
        while (true) {
            System.out.print("  Cedula   : ");
            cedula = sc.nextLine().trim();
            if (cedula.isEmpty())          { System.out.println("  >> Este espacio no puede estar vacio."); continue; }
            if (!cedula.matches("\\d{6,12}")) { System.out.println("  >> La cedula debe contener solo digitos (6-12)."); continue; }
            break;
        }

        String nombre;
        while (true) {
            System.out.print("  Nombre   : ");
            nombre = sc.nextLine().trim();
            if (nombre.isEmpty())                              { System.out.println("  >> Este espacio no puede estar vacio."); continue; }
            if (!nombre.matches("[A-Za-záéíóúÁÉÍÓÚñÑ ]+"))   { System.out.println("  >> El nombre solo puede contener letras."); continue; }
            break;
        }

        String apellido;
        while (true) {
            System.out.print("  Apellido : ");
            apellido = sc.nextLine().trim();
            if (apellido.isEmpty())                              { System.out.println("  >> Este espacio no puede estar vacio."); continue; }
            if (!apellido.matches("[A-Za-záéíóúÁÉÍÓÚñÑ ]+"))   { System.out.println("  >> El apellido solo puede contener letras."); continue; }
            break;
        }

        return new pasajero_modelo(cedula, nombre, apellido);
    }

    public static void mostrar(pasajero_modelo p) {
        System.out.printf(" Cedula : %-22s ", p.getCedula_pasajero());
        System.out.printf(" Nombre : %-22s%n", p.getnombre() + " " + p.getapelido());
    }
}
