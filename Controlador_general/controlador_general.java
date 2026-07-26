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
        VistaCarro.encabezado();
        String placa, marca, modelo, error;

        do {
            placa = VistaCarro.pedirPlaca(sc);
            error = carro_modelo.validarPlaca(placa);
            if (error != null) System.out.println("  >> " + error);
        } while (error != null);

        do {
            marca = VistaCarro.pedirMarca(sc);
            error = carro_modelo.validarMarca(marca);
            if (error != null) System.out.println("  >> " + error);
        } while (error != null);

        do {
            modelo = VistaCarro.pedirModelo(sc);
            error = carro_modelo.validarModelo(modelo);
            if (error != null) System.out.println("  >> " + error);
        } while (error != null);

        return new carro_modelo(placa, marca, modelo);
    }

    public motor_modelo registrarMotor() {
        VistaMotor.encabezado();
        String numSerie, tipo, error;

        do {
            numSerie = VistaMotor.pedirNumSerie(sc);
            error = motor_modelo.validarNumSerie(numSerie);
            if (error != null) System.out.println("  >> " + error);
        } while (error != null);

        do {
            tipo = VistaMotor.pedirTipo(sc);
            error = motor_modelo.validarTipo(tipo);
            if (error != null) System.out.println("  >> " + error);
        } while (error != null);

        return new motor_modelo(numSerie, tipo);
    }

    public chofer_modelo registrarChofer() {
        VistaChofer.encabezado();
        String cedula, nombre, apellido, licencia, error;

        do {
            cedula = VistaChofer.pedirCedula(sc);
            error = chofer_modelo.validarCedula(cedula);
            if (error != null) System.out.println("  >> " + error);
        } while (error != null);

        do {
            nombre = VistaChofer.pedirNombre(sc);
            error = chofer_modelo.validarNombre(nombre);
            if (error != null) System.out.println("  >> " + error);
        } while (error != null);

        do {
            apellido = VistaChofer.pedirApellido(sc);
            error = chofer_modelo.validarApellido(apellido);
            if (error != null) System.out.println("  >> " + error);
        } while (error != null);

        do {
            licencia = VistaChofer.pedirLicencia(sc);
            error = chofer_modelo.validarLicencia(licencia);
            if (error != null) System.out.println("  >> " + error);
        } while (error != null);

        return new chofer_modelo(cedula, nombre, apellido, licencia);
    }

    public pasajero_modelo registrarPasajero() {
        VistaPasajero.encabezado();
        String cedula, nombre, apellido, error;

        do {
            cedula = VistaPasajero.pedirCedula(sc);
            error = pasajero_modelo.validarCedula(cedula);
            if (error != null) System.out.println("  >> " + error);
        } while (error != null);

        do {
            nombre = VistaPasajero.pedirNombre(sc);
            error = pasajero_modelo.validarNombre(nombre);
            if (error != null) System.out.println("  >> " + error);
        } while (error != null);

        do {
            apellido = VistaPasajero.pedirApellido(sc);
            error = pasajero_modelo.validarApellido(apellido);
            if (error != null) System.out.println("  >> " + error);
        } while (error != null);

        return new pasajero_modelo(cedula, nombre, apellido);
    }
}
