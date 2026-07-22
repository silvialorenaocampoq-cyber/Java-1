package modelo;

public class chofer_modelo {

    private String cedula_chofer   = "";
    private String nombre_chofer   = "";
    private String apellido_chofer = "";
    private String licencia        = "";

    public chofer_modelo(String cedula_chofer, String nombre_chofer,
                         String apellido_chofer, String licencia) {
        setCedula_chofer(cedula_chofer);
        setNombre_chofer(nombre_chofer);
        setApellido_chofer(apellido_chofer);
        setLicencia(licencia);
    }

    // Getters
    public String getCedula_chofer()   { return cedula_chofer; }
    public String getNombre_chofer()   { return nombre_chofer; }
    public String getApellido_chofer() { return apellido_chofer; }
    public String getLicencia()        { return licencia; }

    // Setters con validacion
    public void setCedula_chofer(String cedula) {
        if (cedula == null || cedula.trim().isEmpty())
            throw new IllegalArgumentException("La cédula del chofer no puede estar vacía.");
        if (!cedula.trim().matches("\\d{8,10}"))
            throw new IllegalArgumentException("La cédula debe contener entre 8 y 10 dígitos.");
        this.cedula_chofer = cedula.trim();
    }

    public void setNombre_chofer(String nombre) {
        if (nombre == null || nombre.trim().isEmpty())
            throw new IllegalArgumentException("El nombre del chofer no puede estar vacío.");
        if (!nombre.trim().matches("[A-Za-záéíóúÁÉÍÓÚñÑ ]+"))
            throw new IllegalArgumentException("El nombre solo puede contener letras.");
        this.nombre_chofer = nombre.trim();
    }

    public void setApellido_chofer(String apellido) {
        if (apellido == null || apellido.trim().isEmpty())
            throw new IllegalArgumentException("El apellido del chofer no puede estar vacío.");
        if (!apellido.trim().matches("[A-Za-záéíóúÁÉÍÓÚñÑ ]+"))
            throw new IllegalArgumentException("El apellido solo puede contener letras.");
        this.apellido_chofer = apellido.trim();
    }

    public void setLicencia(String licencia) {
        if (licencia == null || licencia.trim().isEmpty())
            throw new IllegalArgumentException("La licencia no puede estar vacía.");
        if (licencia.trim().length() < 5)
            throw new IllegalArgumentException("La licencia debe tener al menos 5 caracteres.");
        this.licencia = licencia.trim().toUpperCase();
    }

    public boolean esValido() {
        return !cedula_chofer.isEmpty() && !nombre_chofer.isEmpty()
            && !apellido_chofer.isEmpty() && !licencia.isEmpty();
    }

    public String getNombreCompleto() {
        return nombre_chofer + " " + apellido_chofer;
    }

    @Override
    public String toString() {
        return "Cédula: " + cedula_chofer + " | Nombre: " + getNombreCompleto()
             + " | Licencia: " + licencia;
    }
}
