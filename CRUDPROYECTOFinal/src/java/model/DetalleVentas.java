package model;

public class DetalleVentas {
    private int idDetalleVentas;
    private int IdVentas;
    private int cantidad;
    private Double PrecioVenta;
    
    public DetalleVentas () {}

    public DetalleVentas(int idDetalleVentas, int IdVentas, int cantidad, Double PrecioVenta) {
        this.idDetalleVentas = idDetalleVentas;
        this.IdVentas = IdVentas;
        this.cantidad = cantidad;
        this.PrecioVenta = PrecioVenta;
    }

    public int getIdDetalleVentas() {
        return idDetalleVentas;
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
