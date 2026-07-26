package modelo;

public class carro_modelo {

    private String placa  = "";
    private String marca  = "";
    private String modelo = "";

    public carro_modelo(String placa, String marca, String modelo) {
        this.placa  = placa;
        this.marca  = marca;
        this.modelo = modelo;
    }

    // Getters
    public String getPlaca()  { return placa; }
    public String getMarca()  { return marca; }
    public String getModelo() { return modelo; }

    // Setters
    public void setPlaca(String placa)   { this.placa = placa; }
    public void setMarca(String marca)   { this.marca = marca; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    // Reglas de validacion del modelo
    public static String validarPlaca(String placa) {
        if (placa == null || placa.trim().isEmpty())
            return "La placa no puede estar vacia.";
        if (!placa.trim().matches("[A-Za-z0-9\\-]{3,10}"))
            return "La placa debe ser alfanumerica y tener entre 3 y 10 caracteres.";
        return null;
    }

    public static String validarMarca(String marca) {
        if (marca == null || marca.trim().isEmpty())
            return "La marca no puede estar vacia.";
        return null;
    }

    public static String validarModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty())
            return "El modelo no puede estar vacio.";
        return null;
    }

    public boolean esValido() {
        return !placa.isEmpty() && !marca.isEmpty() && !modelo.isEmpty();
    }

    public String toString() {
        return "Placa: " + placa + " | Marca: " + marca + " | Modelo: " + modelo;
    }
}
