package Controlador_general;

import modelo.api_modelo;
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
    private api_modelo api;

    public controlador_general(Scanner sc) {
        this.sc  = sc;
        this.api = new api_modelo("http://localhost", "admin", "12345");

        if (api.validar_conexion()) {
            System.out.println("Conexion a la API establecida.");
        } else {
            System.out.println("Error de conexion a la API.");
        }
    }

    // ── CARRO ────────────────────────────────────────────────────
    public void registrarCarro() {
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

        carro_modelo obj = new carro_modelo(placa, marca, modelo);
        api.agregar_carro(obj);
    }

    // ── MOTOR ────────────────────────────────────────────────────
    public void registrarMotor() {
        VistaMotor.encabezado();
        String numSerie, tipo, cilindrada, error;

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

        do {
            cilindrada = VistaMotor.pedirCilindrada(sc);
            error = motor_modelo.validarCilindrada(cilindrada);
            if (error != null) System.out.println("  >> " + error);
        } while (error != null);

        motor_modelo obj = new motor_modelo(numSerie, tipo, cilindrada);
        api.agregar_motor(obj);
    }

    // ── CHOFER ───────────────────────────────────────────────────
    public void registrarChofer() {
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

        chofer_modelo obj = new chofer_modelo(cedula, nombre, apellido, licencia);
        api.agregar_chofer(obj);
    }

    // ── PASAJERO ─────────────────────────────────────────────────
    public void registrarPasajero() {
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

        pasajero_modelo obj = new pasajero_modelo(cedula, nombre, apellido);
        api.agregar_pasajero(obj);
    }

    // ── VER DATOS ALMACENADOS ────────────────────────────────────
    public void verTodo() {
        api.ver_carros();
        api.ver_motores();
        api.ver_choferes();
        api.ver_pasajeros();
    }
}
