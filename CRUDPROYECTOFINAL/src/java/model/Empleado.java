
package model;

public class Empleado {
    private int IdEmpleado;
    private String DPI;
    private String Nombres;
    private String Telefono;
    private String Estado;
    private String Users;

    public Empleado() {
    }

    public Empleado(int IdEmpleado, String DPI, String Nombres, String Telefono, String Estado, String User) {
        this.IdEmpleado = IdEmpleado;
        this.DPI = DPI;
        this.Nombres = Nombres;
        this.Telefono = Telefono;
        this.Estado = Estado;
        this.Users = Users;
    }
    
    

    public int getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(int IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public String getDPI() {
        return DPI;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getUsers() {
        return Users;
    }

    public void setUser(String Users) {
        this.Users = Users;
    }

    @Override
    public String toString() {
        return "Empleado{" + "IdEmpleado=" + IdEmpleado + ", DPI=" + DPI + ", Nombres=" + Nombres + ", Telefono=" + Telefono + ", Estado=" + Estado + ", User=" + Users + '}';
    }
   
    
}
