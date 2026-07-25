package modelo;

public class pasajero_modelo {

    private String nro_cedula = "";
    private String nombre     = "";
    private String apellido   = "";

    public pasajero_modelo(String nro_cedula, String nombre, String apellido) {
        this.nro_cedula = nro_cedula;
        this.nombre     = nombre;
        this.apellido   = apellido;
    }

    // Getters
    public String getCedula_pasajero() { return nro_cedula; }
    public String getnombre()          { return nombre; }
    public String getapelido()         { return apellido; }

    // Setters
    public void setCedula_pasajero(String cedula) { this.nro_cedula = cedula; }
    public void setnombre(String nombre)          { this.nombre = nombre; }
    public void setapellido(String apellido)      { this.apellido = apellido; }

    // Reglas de negocio
    public boolean esValido() {
        return !nro_cedula.isEmpty() && !nombre.isEmpty() && !apellido.isEmpty();
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public String toString() {
        return "Cedula: " + nro_cedula + " | Nombre: " + getNombreCompleto();
    }
}
