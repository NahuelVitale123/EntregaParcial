public class Escritorio extends Productos{
    private Integer ancho;
    private Integer alto;

    public Escritorio(String name, Integer precio, Integer stock, Integer ancho, Integer alto) {
        super(name, precio, stock);
        this.ancho = ancho;
        this.alto = alto;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "nombre:" +getName() + "precio:" + getPrecio() + "stock:" + getStock()+ "ancho:"+ getAncho() + "alto:" + getAlto();
    }
}
