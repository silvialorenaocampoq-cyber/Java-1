package Vista;

import modelo.motor_modelo;
import java.util.Scanner;

public class VistaMotor {

    public static motor_modelo capturar(Scanner sc) {
        System.out.println("DATOS DEL MOTOR");

        String numSerie;
        while (true) {
            System.out.print("  Num. Serie : ");
            numSerie = sc.nextLine().trim();
            if (numSerie.isEmpty())       { System.out.println("  >> Este espacio no puede estar vacio."); continue; }
            if (numSerie.length() < 4)    { System.out.println("  >> El numero de serie debe tener al menos 4 caracteres."); continue; }
            break;
        }

        String tipo;
        while (true) {
            System.out.println("  Tipo de motor:");
            System.out.println("    1. Gasolina");
            System.out.println("    2. Diesel");
            System.out.println("    3. Hibrido");
            System.out.println("    4. Electrico");
            System.out.println("    5. Gas Natural");
            System.out.print("  Seleccione [1-5]: ");
            String[] tipos = {"Gasolina", "Diesel", "Hibrido", "Electrico", "Gas Natural"};
            String input = sc.nextLine().trim();
            try {
                int op = Integer.parseInt(input);
                if (op < 1 || op > 5) { System.out.println("  >> Opcion invalida, elija entre 1 y 5."); continue; }
                tipo = tipos[op - 1];
                break;
            } catch (NumberFormatException e) {
                System.out.println("  >> Ingrese un numero del 1 al 5.");
            }
        }

        return new motor_modelo(numSerie, tipo);
    }

    public static void mostrar(motor_modelo m) {
        System.out.printf("Num. Serie : %-18s%n", m.getNum_serie());
        System.out.printf("Tipo       : %-18s%n", m.getTipo_motor());
    }
}
