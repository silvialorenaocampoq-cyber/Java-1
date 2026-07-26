package Vista;

import java.util.Scanner;

public class VistaMotor {

    public static String pedirNumSerie(Scanner sc) {
        System.out.print("  Num. Serie : ");
        return sc.nextLine().trim();
    }

    public static String pedirTipo(Scanner sc) {
        String[] tipos = {"Gasolina", "Diesel", "Hibrido", "Electrico", "Gas Natural"};
        while (true) {
            System.out.println("  Tipo de motor:");
            System.out.println("    1. Gasolina");
            System.out.println("    2. Diesel");
            System.out.println("    3. Hibrido");
            System.out.println("    4. Electrico");
            System.out.println("    5. Gas Natural");
            System.out.print("  Seleccione [1-5]: ");
            String input = sc.nextLine().trim();
            try {
                int op = Integer.parseInt(input);
                if (op >= 1 && op <= 5) return tipos[op - 1];
                System.out.println("  >> Opcion no valida. Seleccione un numero entre [1-5].");
            } catch (NumberFormatException e) {
                System.out.println("  >> Dato incorrecto. Debe seleccionar una opcion entre [1-5].");
            }
        }
    }

    public static void encabezado() {
        System.out.println("DATOS DEL MOTOR");
    }
}
