public class Productos {
    private String name;
    private Integer precio;
    private Integer stock;

    public Productos() {
    }

    public Productos(String name, Integer precio, Integer stock) {
        this.name = name;
        this.precio = precio;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
