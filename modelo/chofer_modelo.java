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

    // Reglas de negocio
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
