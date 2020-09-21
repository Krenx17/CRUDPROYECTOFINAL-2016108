
package model;


public class DetalleVentas {
    private int IdDetalleVentas;
    private int IdVentas;
    private int IdProducto;
    private int Cantidad;
    private double PrecioVenta;

    public DetalleVentas() {
    }

    public DetalleVentas(int IdDetalleVentas, int IdVentas, int IdProducto, int Cantidad, double PrecioVenta) {
        this.IdDetalleVentas = IdDetalleVentas;
        this.IdVentas = IdVentas;
        this.IdProducto = IdProducto;
        this.Cantidad = Cantidad;
        this.PrecioVenta = PrecioVenta;
    }

    
    public int getIdDetalleVentas() {
        return IdDetalleVentas;
    }

    public void setIdDetalleVentas(int IdDetalleVentas) {
        this.IdDetalleVentas = IdDetalleVentas;
    }

    public int getIdVentas() {
        return IdVentas;
    }

    public void setIdVentas(int IdVentas) {
        this.IdVentas = IdVentas;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(double PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }

    @Override
    public String toString() {
        return "DetalleVentas{" + "IdDetalleVentas=" + IdDetalleVentas + ", IdVentas=" + IdVentas + ", IdProducto=" + IdProducto + ", Cantidad=" + Cantidad + ", PrecioVenta=" + PrecioVenta + '}';
    }
    
    
    
}
