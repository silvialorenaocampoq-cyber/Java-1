package modelo;

public class motor_modelo {

    private String num_serie   = "";
    private String tipo_motor  = "";
    private String cilindrada  = "";

    public motor_modelo(String num_serie, String tipo_motor, String cilindrada) {
        this.num_serie  = num_serie;
        this.tipo_motor = tipo_motor;
        this.cilindrada = cilindrada;
    }

    // Getters
    public String getNum_serie()   { return num_serie; }
    public String getTipo_motor()  { return tipo_motor; }
    public String getCilindrada()  { return cilindrada; }

    // Setters
    public void setNum_serie(String num_serie)    { this.num_serie = num_serie; }
    public void setTipo_motor(String tipo_motor)  { this.tipo_motor = tipo_motor; }
    public void setCilindrada(String cilindrada)  { this.cilindrada = cilindrada; }

    // Validaciones
    public static String validarNumSerie(String num_serie) {
        if (num_serie == null || num_serie.trim().isEmpty())
            return "El numero de serie no puede estar vacio.";
        if (num_serie.trim().length() < 4)
            return "El numero de serie debe tener al menos 4 caracteres.";
        return null;
    }

    public static String validarTipo(String tipo) {
        if (tipo == null || tipo.trim().isEmpty())
            return "Debe seleccionar una opcion de tipo de motor entre [1-5].";
        return null;
    }

    public static String validarCilindrada(String cilindrada) {
        if (cilindrada == null || cilindrada.trim().isEmpty())
            return "La cilindrada no puede estar vacia.";
        return null;
    }

    public boolean esValido() {
        return !num_serie.isEmpty() && !tipo_motor.isEmpty() && !cilindrada.isEmpty();
    }

    public String toString() {
        return "Serie: " + num_serie + " | Tipo: " + tipo_motor + " | Cilindrada: " + cilindrada;
    }
}
