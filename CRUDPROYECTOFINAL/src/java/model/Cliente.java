
package model;

public class Cliente {
    private int IdCliente;
    private String DPI;
    private String Nombre;
    private String Direccion;
    private String Estado;

    public Cliente() {
    }

    public Cliente(int IdCliente, String DPI, String Nombre, String Direccion, String Estado) {
        this.IdCliente = IdCliente;
        this.DPI = DPI;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Estado = Estado;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getDPI() {
        return DPI;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "Cliente{" + "IdCliente=" + IdCliente + ", DPI=" + DPI + ", Nombre=" + Nombre + ", Direccion=" + Direccion + ", Estado=" + Estado + '}';
    }
    
    
}
