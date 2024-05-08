public class Impresoras extends ProductosInformaticos implements Descuento{
    private Integer impresiones;

    public Integer getImpresiones() {
        return impresiones;
    }

    public void setImpresiones(Integer impresiones) {
        this.impresiones = impresiones;
    }

    public Impresoras(String name, Integer precio, Integer stock, String nombreFabricante, Integer impresiones) {
        super(name, precio, stock, nombreFabricante);
        this.impresiones = impresiones;
    }

    @Override
    public String toString() {

        return "nombre:" +getName() + "precio:" + getPrecio() + "stock:" + getStock()+ "nombre de fabricante"+ this.getNombreFabricante() + "cant impresiones:" + getImpresiones() ;

    }
    @Override
    public Integer descuento(Integer porcentaje){

        return getPrecio() % porcentaje;
    }
}
