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
        while (true) {
            try {
                carro_modelo carro = VistaCarro.capturar(sc);
                if (!carro.esValido()) {
                    System.out.println("[Carro] Error: todos los campos son obligatorios.");
                    continue;
                }
                return carro;
            } catch (IllegalArgumentException e) {
                System.out.println("[Carro] Error: " + e.getMessage());
            }
        }
    }

    public motor_modelo registrarMotor() {
        while (true) {
            try {
                motor_modelo motor = VistaMotor.capturar(sc);
                if (!motor.esValido()) {
                    System.out.println("[Motor] Error: todos los campos son obligatorios.");
                    continue;
                }
                if (!motor.esTipoMotorPermitido()) {
                    System.out.println("[Motor] Tipo no válido. Use: gasolina, diesel, electrico o hibrido.");
                    continue;
                }
                return motor;
            } catch (IllegalArgumentException e) {
                System.out.println("[Motor] Error: " + e.getMessage());
            }
        }
    }

    public chofer_modelo registrarChofer() {
        while (true) {
            try {
                chofer_modelo chofer = VistaChofer.capturar(sc);
                if (!chofer.esValido()) {
                    System.out.println("[Chofer] Error: todos los campos son obligatorios.");
                    continue;
                }
                return chofer;
            } catch (IllegalArgumentException e) {
                System.out.println("[Chofer] Error: " + e.getMessage());
            }
        }
    }

    public pasajero_modelo registrarPasajero() {
        while (true) {
            try {
                pasajero_modelo pasajero = VistaPasajero.capturar(sc);
                if (!pasajero.esValido()) {
                    System.out.println("[Pasajero] Error: todos los campos son obligatorios.");
                    continue;
                }
                return pasajero;
            } catch (IllegalArgumentException e) {
                System.out.println("[Pasajero] Error: " + e.getMessage());
            }
        }
    }
}
