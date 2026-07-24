package Vista;

import modelo.chofer_modelo;
import java.util.Scanner;

public class VistaChofer {

    public static chofer_modelo capturar(Scanner sc) {
        System.out.println("DATOS DEL CHOFER");

        String cedula;
        while (true) {
            System.out.print("  Cedula          : ");
            cedula = sc.nextLine().trim();
            if (cedula.isEmpty())             { System.out.println("  >> Este espacio no puede estar vacio."); continue; }
            if (!cedula.matches("\\d{6,12}")) { System.out.println("  >> La cedula debe contener solo digitos (6-12)."); continue; }
            break;
        }

        String nombre;
        while (true) {
            System.out.print("  Nombre          : ");
            nombre = sc.nextLine().trim();
            if (nombre.isEmpty())                            { System.out.println("  >> Este espacio no puede estar vacio."); continue; }
            if (!nombre.matches("[A-Za-záéíóúÁÉÍÓÚñÑ ]+")) { System.out.println("  >> El nombre solo puede contener letras."); continue; }
            break;
        }

        String apellido;
        while (true) {
            System.out.print("  Apellido        : ");
            apellido = sc.nextLine().trim();
            if (apellido.isEmpty())                            { System.out.println("  >> Este espacio no puede estar vacio."); continue; }
            if (!apellido.matches("[A-Za-záéíóúÁÉÍÓÚñÑ ]+")) { System.out.println("  >> El apellido solo puede contener letras."); continue; }
            break;
        }

        String licencia;
        while (true) {
            System.out.print("  Num. Licencia   : ");
            licencia = sc.nextLine().trim();
            if (licencia.isEmpty())        { System.out.println("  >> Este espacio no puede estar vacio."); continue; }
            if (licencia.length() < 5)     { System.out.println("  >> La licencia debe tener al menos 5 caracteres."); continue; }
            break;
        }

        return new chofer_modelo(cedula, nombre, apellido, licencia);
    }

    public static void mostrar(chofer_modelo c) {
        System.out.printf("Cedula   : %-20s%n", c.getCedula_chofer());
        System.out.printf("Nombre   : %-20s%n", c.getNombre_chofer() + " " + c.getApellido_chofer());
        System.out.printf("Licencia : %-20s%n", c.getLicencia());
    }
}
