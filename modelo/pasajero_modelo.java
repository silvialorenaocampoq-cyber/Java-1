package modelo;

public class pasajero_modelo {

    private String nro_cedula = "";
    private String nombre     = "";
    private String apellido   = "";

    public pasajero_modelo(String nro_cedula, String nombre, String apellido) {
        setCedula_pasajero(nro_cedula);
        setnombre(nombre);
        setapellido(apellido);
    }

    // Getters
    public String getCedula_pasajero() { return nro_cedula; }
    public String getnombre()          { return nombre; }
    public String getapelido()         { return apellido; }

    // Setters con validacion
    public void setCedula_pasajero(String cedula) {
        if (cedula == null || cedula.trim().isEmpty())
            throw new IllegalArgumentException("La cédula del pasajero no puede estar vacía.");
        if (!cedula.trim().matches("\\d{8,10}"))
            throw new IllegalArgumentException("La cédula debe contener entre 8 y 10 dígitos.");
        this.nro_cedula = cedula.trim();
    }

    public void setnombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty())
            throw new IllegalArgumentException("El nombre del pasajero no puede estar vacío.");
        if (!nombre.trim().matches("[A-Za-záéíóúÁÉÍÓÚñÑ ]+"))
            throw new IllegalArgumentException("El nombre solo puede contener letras.");
        this.nombre = nombre.trim();
    }

    public void setapellido(String apellido) {
        if (apellido == null || apellido.trim().isEmpty())
            throw new IllegalArgumentException("El apellido del pasajero no puede estar vacío.");
        if (!apellido.trim().matches("[A-Za-záéíóúÁÉÍÓÚñÑ ]+"))
            throw new IllegalArgumentException("El apellido solo puede contener letras.");
        this.apellido = apellido.trim();
    }

    public boolean esValido() {
        return !nro_cedula.isEmpty() && !nombre.isEmpty() && !apellido.isEmpty();
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    @Override
    public String toString() {
        return "Cédula: " + nro_cedula + " | Nombre: " + getNombreCompleto();
    }
}
