package Motor;

public class motor_modelo {

    private String num_serie = "";
    private String tipo_motor = "";

    // Constructor
    public motor_modelo(String num_serie, String tipo_motor) {
        this.num_serie = num_serie;
        this.tipo_motor = tipo_motor;
    }

    // Getters
    public String getNum_serie() { return num_serie; }
    public String getTipo_motor() { return tipo_motor; }

    // Setters
    public void setNum_serie(String num_serie) { this.num_serie = num_serie; }
    public void setTipo_motor(String tipo_motor) { this.tipo_motor = tipo_motor; }

    @Override
    public String toString() {
        return "Num. Serie: " + num_serie + " | Tipo: " + tipo_motor;
    }
}
