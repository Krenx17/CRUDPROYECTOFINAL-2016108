package model;

public class Producto {
    private int IdProducto;
    private String Nombre;
    private Double precio;
    private int Stock;
    private String Estado;
    
    public Producto() {}

    public Producto(int IdProducto, String Nombre, Double precio, int Stock, String Estado) {
        this.IdProducto = IdProducto;
        this.Nombre = Nombre;
        this.precio = precio;
        this.Stock = Stock;
        this.Estado = Estado;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
    
}

