package Vista;

import modelo.carro_modelo;
import java.util.Scanner;

public class VistaCarro {

    public static carro_modelo capturar(Scanner sc) {
        System.out.println("DATOS DEL CARRO");

        String placa;
        while (true) {
            System.out.print("  Placa   : ");
            placa = sc.nextLine().trim();
            if (placa.isEmpty())                          { System.out.println("  >> Este espacio no puede estar vacio."); continue; }
            if (!placa.matches("[A-Za-z0-9\\-]{3,10}"))  { System.out.println("  >> La placa debe tener entre 3 y 10 caracteres alfanumericos."); continue; }
            break;
        }

        String marca;
        while (true) {
            System.out.print("  Marca   : ");
            marca = sc.nextLine().trim();
            if (marca.isEmpty()) { System.out.println("  >> Este espacio no puede estar vacio."); continue; }
            break;
        }

        String modelo;
        while (true) {
            System.out.print("  Modelo  : ");
            modelo = sc.nextLine().trim();
            if (modelo.isEmpty()) { System.out.println("  >> Este espacio no puede estar vacio."); continue; }
            break;
        }

        return new carro_modelo(placa, marca, modelo);
    }

    public static void mostrar(carro_modelo c) {
        System.out.printf("Placa  : %-22s%n", c.getPlaca());
        System.out.printf("Marca  : %-22s%n", c.getMarca());
        System.out.printf("Modelo : %-22s%n", c.getModelo());
    }
}
