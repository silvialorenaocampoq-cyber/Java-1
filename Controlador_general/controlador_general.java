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

    public carro_modelo registrarCarro()         { return VistaCarro.capturar(sc); }
    public motor_modelo registrarMotor()         { return VistaMotor.capturar(sc); }
    public chofer_modelo registrarChofer()       { return VistaChofer.capturar(sc); }
    public pasajero_modelo registrarPasajero()   { return VistaPasajero.capturar(sc); }
}
