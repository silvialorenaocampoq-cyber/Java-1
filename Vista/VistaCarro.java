package Vista;

import modelo.carro_modelo;
import java.util.Scanner;

public class VistaCarro {

    public static carro_modelo capturar(Scanner sc) {
        System.out.println("DATOS DEL CARRO");

        System.out.print("  Placa   : ");
        String placa = sc.nextLine().trim();

        System.out.print("  Marca   : ");
        String marca = sc.nextLine().trim();

        System.out.print("  Modelo  : ");
        String modelo = sc.nextLine().trim();

        return new carro_modelo(placa, marca, modelo);
    }

    public static void mostrar(carro_modelo c) {
        System.out.printf ("Placa  : %-22s ", c.getPlaca());
        System.out.printf (" Marca  : %-22s", c.getMarca());
        System.out.printf ("Modelo : %-22s ", c.getModelo());
    }
}
