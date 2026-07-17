package Pasajero;

public class pasajero_modelo {

    private String nro_cedula = "";
    private String nombre = "";
    private String apelido = "";

    // Constructor
    public pasajero_modelo(String nro_cedula, String nombre, String apelido) {
        this.nro_cedula = nro_cedula;
        this.nombre = nombre;
        this.apelido = apelido;
    }

    // Getters
    public String getCedula_pasajero() { return nro_cedula; }
    public String getnombre() { return nombre; }
    public String getapelido() { return apelido; }

    // Setters
    public void setCedula_pasajero(String nro_cedula) { this.nro_cedula = nro_cedula; }
    public void setnombre(String nombre) { this.nombre = nombre; }
    public void setapelido(String apelido) { this.apelido = apelido; }

    @Override
    public String toString() {
        return "Cédula: " + nro_cedula + " | Nombre: " + nombre + " " + apelido;
    }
}
