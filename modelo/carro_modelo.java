package modelo;

public class carro_modelo {

    private String placa = "";
    private String marca = "";
    private String modelo = "";

    // Constructor
    public carro_modelo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters
    public String getPlaca() { return placa; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }

    // Setters
    public void setPlaca(String placa) { this.placa = placa; }
    public void setMarca(String marca) { this.marca = marca; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    @Override
    public String toString() {
        return "Placa: " + placa + " | Marca: " + marca + " | Modelo: " + modelo;
    }
}
