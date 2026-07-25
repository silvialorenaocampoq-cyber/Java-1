package modelo;

public class api_modelo {

    String clave   = "";
    String root    = "";
    String url     = "";

    public api_modelo(String url, String root, String clave) {
        this.url   = url;
        this.root  = root;
        this.clave = clave;
    }

    // Getters
    public String getClave() { return clave; }
    public String getRoot()  { return root; }
    public String getUrl()   { return url; }

    // Setters
    public void setClave(String clave) { this.clave = clave; }
    public void setRoot(String root)   { this.root = root; }
    public void setUrl(String url)     { this.url = url; }

    // Valida la conexion verificando la clave
    public boolean validar_conexion() {
        if (this.clave.equals("12345")) {
            return true;
        } else {
            return false;
        }
    }

    // Cierra la conexion
    public void desconexion() {
        System.out.println("Desconexion realizada...");
    }

    // Busca un chofer por cedula
    public void buscar_chofer(String cedula) {
        System.out.println("Buscando chofer con cedula: " + cedula);
    }
}
