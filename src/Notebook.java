public class Notebook extends ProductosInformaticos{
    private Integer memoria;

    public Integer getMemoria() {
        return memoria;
    }

    public void setMemoria(Integer memoria) {
        this.memoria = memoria;
    }

    public Notebook(String name, Integer precio, Integer stock, String nombreFabricante, Integer memoria) {
        super(name, precio, stock, nombreFabricante);
        this.memoria = memoria;
    }
    @Override
    public String toString() {

        return "nombre:" +getName() + "precio:" + getPrecio() + "stock:" + getStock()+ "nombre de fabricante"+ this.getNombreFabricante() + "cant impresiones:" + getMemoria() ;

    }
}
