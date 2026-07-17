package Ficha;

import Carro.carro_modelo;
import Motor.motor_modelo;
import Chofer.chofer_modelo;
import Pasajero.pasajero_modelo;


public class ficha_viaje {

    private carro_modelo carro;
    private motor_modelo motor;
    private chofer_modelo chofer;
    private pasajero_modelo pasajero;

    public ficha_viaje() {}

    // Getters
    public carro_modelo getCarro() { return carro; }
    public motor_modelo getMotor() { return motor; }
    public chofer_modelo getChofer() { return chofer; }
    public pasajero_modelo getPasajero() { return pasajero; }

    // Setters
    public void setCarro(carro_modelo carro) { this.carro = carro; }
    public void setMotor(motor_modelo motor) { this.motor = motor; }
    public void setChofer(chofer_modelo chofer) { this.chofer = chofer; }
    public void setPasajero(pasajero_modelo pasajero) { this.pasajero = pasajero; }

    @Override
    public String toString() {
        return "\n  [CARRO]    " + (carro != null ? carro : "Sin datos") +
               "\n  [MOTOR]    " + (motor != null ? motor : "Sin datos") +
               "\n  [CHOFER]   " + (chofer != null ? chofer : "Sin datos") +
               "\n  [PASAJERO] " + (pasajero != null ? pasajero : "Sin datos");
    }
}
