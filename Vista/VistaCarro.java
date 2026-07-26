package Vista;

import java.util.Scanner;

public class VistaCarro {

    public static String pedirPlaca(Scanner sc) {
        System.out.print("  Placa   : ");
        return sc.nextLine().trim();
    }

    public static String pedirMarca(Scanner sc) {
        System.out.print("  Marca   : ");
        return sc.nextLine().trim();
    }

    public static String pedirModelo(Scanner sc) {
        System.out.print("  Modelo  : ");
        return sc.nextLine().trim();
    }

    public static void encabezado() {
        System.out.println("DATOS DEL CARRO");
    }
}
