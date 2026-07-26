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

    // Reglas de validacion del modelo
    public static String validarCedula(String cedula) {
        if (cedula == null || cedula.trim().isEmpty())
            return "La cedula no puede estar vacia.";
        if (!cedula.trim().matches("\\d{6,12}"))
            return "La cedula debe contener solo digitos (6-12).";
        return null;
    }

    public static String validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty())
            return "El nombre no puede estar vacio.";
        if (!nombre.trim().matches("[A-Za-záéíóúÁÉÍÓÚñÑ ]+"))
            return "El nombre solo puede contener letras.";
        return null;
    }

    public static String validarApellido(String apellido) {
        if (apellido == null || apellido.trim().isEmpty())
            return "El apellido no puede estar vacio.";
        if (!apellido.trim().matches("[A-Za-záéíóúÁÉÍÓÚñÑ ]+"))
            return "El apellido solo puede contener letras.";
        return null;
    }

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
