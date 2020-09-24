package model;

public class DetalleVentas {
    private int idDetalleVentas;
    private int IdVentas;
    private int IdProducto;
    private int cantidad;
    private Double PrecioVenta;
    
    public DetalleVentas () {}

    public DetalleVentas(int idDetalleVentas, int IdVentas, int IdProducto, int cantidad, Double PrecioVenta) {
        this.idDetalleVentas = idDetalleVentas;
        this.IdVentas = IdVentas;
        this.IdProducto = IdProducto;
        this.cantidad = cantidad;
        this.PrecioVenta = PrecioVenta;
    }

    public int getIdDetalleVentas() {
        return idDetalleVentas;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public void setIdDetalleVentas(int idDetalleVentas) {
        this.idDetalleVentas = idDetalleVentas;
    }

    public int getIdVentas() {
        return IdVentas;
    }

    public void setIdVentas(int IdVentas) {
        this.IdVentas = IdVentas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(Double PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }
    
    
}
