package Vista;

import Ficha.ficha_viaje;

public class VistaResumen {

    public static void mostrar(ficha_viaje ficha) {
        System.out.println("RESUMEN DE LA FICHA DE VIAJE");

        System.out.println("CARRO");
        VistaCarro.mostrar(ficha.getCarro());

        System.out.println("MOTOR");
        VistaMotor.mostrar(ficha.getMotor());

        System.out.println(" CHOFER");
        VistaChofer.mostrar(ficha.getChofer());

        System.out.println("PASAJERO");
        VistaPasajero.mostrar(ficha.getPasajero());

        System.out.println();
    }
}
