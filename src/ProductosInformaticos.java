public class ProductosInformaticos extends Productos{
    private String nombreFabricante;

    public ProductosInformaticos(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    public ProductosInformaticos(String name, Integer precio, Integer stock, String nombreFabricante) {
        super(name, precio, stock);
        this.nombreFabricante = nombreFabricante;
    }
}
