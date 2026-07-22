package modelo;

public class carro_modelo {

    private String placa = "";
    private String marca = "";
    private String modelo = "";

    public carro_modelo(String placa, String marca, String modelo) {
        setPlaca(placa);
        setMarca(marca);
        setModelo(modelo);
    }

    // Getters
    public String getPlaca()  { return placa; }
    public String getMarca()  { return marca; }
    public String getModelo() { return modelo; }

    public void setPlaca(String placa) {
        if (placa == null || placa.trim().isEmpty())
            throw new IllegalArgumentException("La placa no puede estar vacía.");
        if (!placa.trim().matches("[A-Za-z0-9\\-]{3,10}"))
            throw new IllegalArgumentException("La placa debe tener entre 3 y 10 caracteres alfanuméricos.");
        this.placa = placa.trim().toUpperCase();
    }

    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty())
            throw new IllegalArgumentException("La marca no puede estar vacía.");
        this.marca = marca.trim();
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty())
            throw new IllegalArgumentException("El modelo no puede estar vacío.");
        this.modelo = modelo.trim();
    }

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
