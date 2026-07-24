package modelo;

public class motor_modelo {

    private String num_serie  = "";
    private String tipo_motor = "";

    public motor_modelo(String num_serie, String tipo_motor) {
        this.num_serie  = num_serie;
        this.tipo_motor = tipo_motor;
    }

    // Getters
    public String getNum_serie()  { return num_serie; }
    public String getTipo_motor() { return tipo_motor; }

    // Setters
    public void setNum_serie(String num_serie)   { this.num_serie = num_serie; }
    public void setTipo_motor(String tipo_motor) { this.tipo_motor = tipo_motor; }

    // Reglas de negocio
    public boolean esValido() {
        return !num_serie.isEmpty() && !tipo_motor.isEmpty();
    }

    public boolean esTipoMotorPermitido() {
        String tipo = tipo_motor.toLowerCase()
            .replace("é", "e").replace("í", "i");
        return tipo.equals("gasolina") || tipo.equals("diesel")
            || tipo.equals("electrico") || tipo.equals("hibrido")
            || tipo.equals("gas natural");
    }

    @Override
    public String toString() {
        return "Num. Serie: " + num_serie + " | Tipo: " + tipo_motor;
    }
}
