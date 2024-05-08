public class Silla extends Productos implements Descuento{
    private Integer cantRuedas;

    public Silla(String name, Integer precio, Integer stock, Integer cantRuedas) {
        super(name, precio, stock);
        this.cantRuedas = cantRuedas;
    }

    public Integer getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(Integer cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    @Override
    public String toString() {
        return "nombre:" +getName() + "precio:" + getPrecio() + "stock:" + getStock()+ getCantRuedas();
    }
    @Override
    public Integer descuento(Integer porcentaje)
    {
        return getPrecio() %porcentaje;
    }
}
