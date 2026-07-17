package Vista;

import Motor.motor_modelo;
import java.util.Scanner;

public class VistaMotor {

    public static motor_modelo capturar(Scanner sc) {
        System.out.println("DATOS DEL MOTOR ");

        System.out.print("  Número de Serie : ");
        String numSerie = sc.nextLine().trim();

        System.out.println("  Tipo de motor:");
        System.out.println("    1. Gasolina");
        System.out.println("    2. Diesel");
        System.out.println("    3. Híbrido");
        System.out.println("    4. Eléctrico");
        System.out.println("    5. Gas Natural");
        System.out.print("  Seleccione opción [1-5]: ");
        String[] tipos = {"Gasolina", "Diesel", "Híbrido", "Eléctrico", "Gas Natural"};
        String tipo;
        try {
            int op = Integer.parseInt(sc.nextLine().trim());
            tipo = (op >= 1 && op <= 5) ? tipos[op - 1] : "Otro";
        } catch (NumberFormatException e) {
            tipo = "Otro";
        }

        return new motor_modelo(numSerie, tipo);
    }

    public static void mostrar(motor_modelo m) {
        System.out.printf ("Num. Serie : %-18s", m.getNum_serie());
        System.out.printf ("Tipo       : %-18s", m.getTipo_motor());
    }
}
