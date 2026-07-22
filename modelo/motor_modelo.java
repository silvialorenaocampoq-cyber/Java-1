package modelo;

public class motor_modelo {

    private String num_serie = "";
    private String tipo_motor = "";

    public motor_modelo(String num_serie, String tipo_motor) {
        setNum_serie(num_serie);
        setTipo_motor(tipo_motor);
    }

    // Getters
    public String getNum_serie()   { return num_serie; }
    public String getTipo_motor()  { return tipo_motor; }

    // Setters con validacion
    public void setNum_serie(String num_serie) {
        if (num_serie == null || num_serie.trim().isEmpty())
            throw new IllegalArgumentException("El número de serie no puede estar vacío.");
        if (num_serie.trim().length() < 4)
            throw new IllegalArgumentException("El número de serie debe tener al menos 4 caracteres.");
        this.num_serie = num_serie.trim().toUpperCase();
    }

    public void setTipo_motor(String tipo_motor) {
        if (tipo_motor == null || tipo_motor.trim().isEmpty())
            throw new IllegalArgumentException("El tipo de motor no puede estar vacío.");
        this.tipo_motor = tipo_motor.trim();
    }

    public boolean esValido() {
        return !num_serie.isEmpty() && !tipo_motor.isEmpty();
    }

    public boolean esTipoMotorPermitido() {
        String tipo = tipo_motor.toLowerCase()
            .replace("é", "e").replace("í", "i"); 
        return tipo.equals("gasolina") || tipo.equals("diesel")
            || tipo.equals("electrico") || tipo.equals("hibrido")
            || tipo.equals("gas natural") || tipo.equals("otro");
    }

    @Override
    public String toString() {
        return "Num. Serie: " + num_serie + " | Tipo: " + tipo_motor;
    }
}
