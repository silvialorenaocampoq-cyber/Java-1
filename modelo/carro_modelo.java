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

    // Reglas de negocio
    public boolean esValido() {
        return !placa.isEmpty() && !marca.isEmpty() && !modelo.isEmpty();
    }

    public boolean tieneFormatoPlacaValido() {
        return placa.matches("[A-Z]{3}-?\\d{3,4}");
    }

    @Override
    public String toString() {
        return "Placa: " + placa + " | Marca: " + marca + " | Modelo: " + modelo;
    }
}
