package modelo;

public class chofer_modelo {

    private String cedula_chofer   = "";
    private String nombre_chofer   = "";
    private String apellido_chofer = "";
    private String licencia        = "";

    public chofer_modelo(String cedula_chofer, String nombre_chofer,
                         String apellido_chofer, String licencia) {
        this.cedula_chofer   = cedula_chofer;
        this.nombre_chofer   = nombre_chofer;
        this.apellido_chofer = apellido_chofer;
        this.licencia        = licencia;
    }

    // Getters
    public String getCedula_chofer()   { return cedula_chofer; }
    public String getNombre_chofer()   { return nombre_chofer; }
    public String getApellido_chofer() { return apellido_chofer; }
    public String getLicencia()        { return licencia; }

    // Setters
    public void setCedula_chofer(String cedula_chofer)     { this.cedula_chofer = cedula_chofer; }
    public void setNombre_chofer(String nombre_chofer)     { this.nombre_chofer = nombre_chofer; }
    public void setApellido_chofer(String apellido_chofer) { this.apellido_chofer = apellido_chofer; }
    public void setLicencia(String licencia)               { this.licencia = licencia; }

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

    public static String validarLicencia(String licencia) {
        if (licencia == null || licencia.trim().isEmpty())
            return "La licencia no puede estar vacia.";
        if (licencia.trim().length() < 5)
            return "La licencia debe tener al menos 5 caracteres.";
        return null;
    }

    public boolean esValido() {
        return !cedula_chofer.isEmpty() && !nombre_chofer.isEmpty()
            && !apellido_chofer.isEmpty() && !licencia.isEmpty();
    }

    public String getNombreCompleto() {
        return nombre_chofer + " " + apellido_chofer;
    }

    public String toString() {
        return "Cedula: " + cedula_chofer + " | Nombre: " + getNombreCompleto()
             + " | Licencia: " + licencia;
    }
}
