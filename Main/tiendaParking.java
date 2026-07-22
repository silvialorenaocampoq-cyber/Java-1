package Main;

import Controlador_general.controlador_general;
import java.util.Scanner;

public class tiendaParking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("SISTEMA DE REGISTRO - TIENDA PARKING");

        controlador_general ctrl = new controlador_general(sc);
        ctrl.registrarCarro();
        ctrl.registrarMotor();
        ctrl.registrarChofer();
        ctrl.registrarPasajero();

        System.out.println("Fin");
        sc.close();
    }
}
