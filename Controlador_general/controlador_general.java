package Controlador_general;

import modelo.carro_modelo;
import modelo.chofer_modelo;
import modelo.motor_modelo;
import modelo.pasajero_modelo;
import Vista.VistaCarro;
import Vista.VistaChofer;
import Vista.VistaMotor;
import Vista.VistaPasajero;
import java.util.Scanner;

public class controlador_general {

    private Scanner sc;

    public controlador_general(Scanner sc) {
        this.sc = sc;
    }

    public carro_modelo registrarCarro() {
        carro_modelo carro = VistaCarro.capturar(sc);
        if (carro.getPlaca().isEmpty() || carro.getMarca().isEmpty() || carro.getModelo().isEmpty()) {
            System.out.println("[Carro] Error: todos los campos son obligatorios.");
            return null;
        }
        return carro;
    }

    public motor_modelo registrarMotor() {
        motor_modelo motor = VistaMotor.capturar(sc);
        if (motor.getNum_serie().isEmpty() || motor.getTipo_motor().isEmpty()) {
            System.out.println("[Motor] Error: todos los campos son obligatorios.");
            return null;
        }
        return motor;
    }

    public chofer_modelo registrarChofer() {
        chofer_modelo chofer = VistaChofer.capturar(sc);
        if (chofer.getCedula_chofer().isEmpty() || chofer.getNombre_chofer().isEmpty()
                || chofer.getApellido_chofer().isEmpty() || chofer.getLicencia().isEmpty()) {
            System.out.println("[Chofer] Error: todos los campos son obligatorios.");
            return null;
        }
        return chofer;
    }

    public pasajero_modelo registrarPasajero() {
        pasajero_modelo pasajero = VistaPasajero.capturar(sc);
        if (pasajero.getCedula_pasajero().isEmpty() || pasajero.getnombre().isEmpty()
                || pasajero.getapelido().isEmpty()) {
            System.out.println("[Pasajero] Error: todos los campos son obligatorios.");
            return null;
        }
        return pasajero;
    }
}
