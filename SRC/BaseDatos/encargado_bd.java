package BaseDatos;

import Ficha.ficha_viaje;


public class encargado_bd {

    
    public boolean validarFicha(ficha_viaje ficha) {
        if (ficha.getCarro() == null) {
            System.out.println("[BD] ERROR: Faltan datos del carro.");
            return false;
        }
        if (ficha.getMotor() == null) {
            System.out.println("[BD] ERROR: Faltan datos del motor.");
            return false;
        }
        if (ficha.getChofer() == null) {
            System.out.println("[BD] ERROR: Faltan datos del chofer.");
            return false;
        }
        if (ficha.getPasajero() == null) {
            System.out.println("[BD] ERROR: Faltan datos del pasajero.");
            return false;
        }
        return true;
    }

    
    public void guardarFicha(ficha_viaje ficha) {
        System.out.println("ENCARGADO DE BASE DE DATOS");

        if (validarFicha(ficha)) {
            System.out.println("[BD] Validación exitosa. Guardando ficha...");
            System.out.println("FICHA DE VIAJE REGISTRADA:" + ficha);
            System.out.println("[BD] Ficha guardada correctamente en la base de datos.");
        } else {
            System.out.println("[BD] No se pudo guardar. Complete todos los datos.");
        }

    }
}
