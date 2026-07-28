package modelo;

import java.util.ArrayList;

public class api_modelo {

    private String url;
    private String root;
    private String clave;

    private String[][] carros  = new String[3][3];
    private int total_carros   = 0;

    private String[][] motores = new String[3][3];
    private int total_motores  = 0;

    private ArrayList<chofer_modelo> choferes   = new ArrayList<>();

    private ArrayList<pasajero_modelo> pasajeros = new ArrayList<>();

    public api_modelo(String url, String root, String clave) {
        this.url   = url;
        this.root  = root;
        this.clave = clave;
    }

    public String getUrl()   { return url; }
    public String getRoot()  { return root; }
    public String getClave() { return clave; }

    public boolean validar_conexion() {
        return this.clave.equals("12345");
    }

    public void desconexion() {
        System.out.println("Desconexion realizada.");
    }


    public void agregar_carro(carro_modelo c) {
        if (total_carros < 3) {
            carros[total_carros][0] = c.getPlaca();
            carros[total_carros][1] = c.getMarca();
            carros[total_carros][2] = c.getModelo();
            total_carros++;
            System.out.println("Carro agregado. Total: " + total_carros);
        } else {
            System.out.println("Almacenamiento de carros lleno (max 3).");
        }
    }

    public void ver_carro(int indice) {
        if (indice >= 0 && indice < total_carros) {
            System.out.println("Carro [" + indice + "] -> Placa: " + carros[indice][0]
                + " | Marca: " + carros[indice][1]
                + " | Modelo: " + carros[indice][2]);
        } else {
            System.out.println("Posicion de carro invalida.");
        }
    }

    public void ver_carros() {
        if (total_carros == 0) { System.out.println("No hay carros registrados."); return; }
        System.out.println(" Carros (" + total_carros + ")");
        int i = 0;
        while (i < total_carros) {
            System.out.println("[" + i + "] Placa: " + carros[i][0]
                + " Marca: " + carros[i][1]
                + " Modelo: " + carros[i][2]);
            i++;
        }
    }

    public void actualizar_carro(int indice, carro_modelo c) {
        if (indice >= 0 && indice < total_carros) {
            carros[indice][0] = c.getPlaca();
            carros[indice][1] = c.getMarca();
            carros[indice][2] = c.getModelo();
            System.out.println("Carro actualizado.");
        } else {
            System.out.println("Posicion de carro invalida.");
        }
    }

    public void eliminar_carro(int indice) {
        if (indice >= 0 && indice < total_carros) {
            int i = indice;
            while (i < total_carros - 1) {
                carros[i][0] = carros[i + 1][0];
                carros[i][1] = carros[i + 1][1];
                carros[i][2] = carros[i + 1][2];
                i++;
            }
            carros[total_carros - 1][0] = null;
            carros[total_carros - 1][1] = null;
            carros[total_carros - 1][2] = null;
            total_carros--;
            System.out.println("Carro eliminado. Total: " + total_carros);
        } else {
            System.out.println("Posicion de carro invalida.");
        }
    }


    public void agregar_motor(motor_modelo m) {
        if (total_motores < 3) {
            motores[total_motores][0] = m.getNum_serie();
            motores[total_motores][1] = m.getTipo_motor();
            motores[total_motores][2] = m.getCilindrada();
            total_motores++;
            System.out.println("Motor agregado. Total: " + total_motores);
        } else {
            System.out.println("Almacenamiento de motores lleno (max 3).");
        }
    }

    public void ver_motor(int indice) {
        if (indice >= 0 && indice < total_motores) {
            System.out.println("Motor [" + indice + "] -> Serie: " + motores[indice][0]
                + " | Tipo: " + motores[indice][1]
                + " | Cilindrada: " + motores[indice][2]);
        } else {
            System.out.println("Posicion de motor invalida.");
        }
    }

    public void ver_motores() {
        if (total_motores == 0) { System.out.println("No hay motores registrados."); return; }
        System.out.println(" Motores (" + total_motores + ")");
        int i = 0;
        while (i < total_motores) {
            System.out.println("[" + i + "] Serie: " + motores[i][0]
                + " Tipo: " + motores[i][1]
                + " Cilindrada: " + motores[i][2]);
            i++;
        }
    }

    public void actualizar_motor(int indice, motor_modelo m) {
        if (indice >= 0 && indice < total_motores) {
            motores[indice][0] = m.getNum_serie();
            motores[indice][1] = m.getTipo_motor();
            motores[indice][2] = m.getCilindrada();
            System.out.println("Motor actualizado.");
        } else {
            System.out.println("Posicion de motor invalida.");
        }
    }

    public void eliminar_motor(int indice) {
        if (indice >= 0 && indice < total_motores) {
            int i = indice;
            while (i < total_motores - 1) {
                motores[i][0] = motores[i + 1][0];
                motores[i][1] = motores[i + 1][1];
                motores[i][2] = motores[i + 1][2];
                i++;
            }
            motores[total_motores - 1][0] = null;
            motores[total_motores - 1][1] = null;
            motores[total_motores - 1][2] = null;
            total_motores--;
            System.out.println("Motor eliminado. Total: " + total_motores);
        } else {
            System.out.println("Posicion de motor invalida.");
        }
    }



    public void agregar_chofer(chofer_modelo c)          { choferes.add(c); System.out.println("Chofer agregado."); }
    public chofer_modelo get_chofer(int i)               { return choferes.get(i); }
    public void actualizar_chofer(int i, chofer_modelo c){ choferes.set(i, c); System.out.println("Chofer actualizado."); }
    public void eliminar_chofer(int i)                   { choferes.remove(i); System.out.println("Chofer eliminado."); }
    public int total_choferes()                          { return choferes.size(); }

    public void ver_choferes() {
        if (choferes.isEmpty()) { System.out.println("No hay choferes registrados."); return; }
        System.out.println("--- Choferes (" + choferes.size() + ") ---");
        int i = 0;
        while (i < choferes.size()) {
            System.out.println("[" + i + "] " + choferes.get(i).toString());
            i++;
        }
    }

    public void buscar_chofer(String cedula) {
        int i = 0;
        while (i < choferes.size()) {
            if (choferes.get(i).getCedula_chofer().equals(cedula)) {
                System.out.println("Chofer encontrado: " + choferes.get(i).toString());
                return;
            }
            i++;
        }
        System.out.println("Chofer con cedula " + cedula + " no encontrado.");
    }


    public void agregar_pasajero(pasajero_modelo p)           { pasajeros.add(p); System.out.println("Pasajero agregado."); }
    public pasajero_modelo get_pasajero(int i)                { return pasajeros.get(i); }
    public void actualizar_pasajero(int i, pasajero_modelo p) { pasajeros.set(i, p); System.out.println("Pasajero actualizado."); }
    public void eliminar_pasajero(int i)                      { pasajeros.remove(i); System.out.println("Pasajero eliminado."); }
    public int total_pasajeros()                              { return pasajeros.size(); }

    public void ver_pasajeros() {
        if (pasajeros.isEmpty()) { System.out.println("No hay pasajeros registrados."); return; }
        System.out.println("Pasajeros (" + pasajeros.size() + ")");
        int i = 0;
        while (i < pasajeros.size()) {
            System.out.println("[" + i + "] " + pasajeros.get(i).toString());
            i++;
        }
    }
}
