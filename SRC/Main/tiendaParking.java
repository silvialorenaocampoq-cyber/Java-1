package Main;

import BaseDatos.encargado_bd;
import Ficha.ficha_viaje;
import Vista.*;
import java.util.Scanner;

public class tiendaParking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("SISTEMA DE REGISTRO - TIENDA PARKING");

        ficha_viaje ficha = new ficha_viaje();

        ficha.setCarro(VistaCarro.capturar(sc));

        ficha.setMotor(VistaMotor.capturar(sc));

        ficha.setChofer(VistaChofer.capturar(sc));

        ficha.setPasajero(VistaPasajero.capturar(sc));

        VistaResumen.mostrar(ficha);

        System.out.print("Confirmar y guardar ficha? : ");
        String respuesta = sc.nextLine().trim().toLowerCase();

        if (respuesta.equals("si")) {
            encargado_bd bd = new encargado_bd();
            bd.guardarFicha(ficha);
        } else {
            System.out.println("Registro cancelado. La ficha no fue guardada.");
        }

        System.out.println("Fin del programa.");
        sc.close();
    }
}
