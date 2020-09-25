
package model;

public class Empleado {
    private int IdEmpleado;
    private String DPI;
    private String Nombre;
    private String Telefono;
    private String Estado;
    private String Users;

    public Empleado() {
    }

    public Empleado(int IdEmpleado, String DPI, String Nombre, String Telefono, String Estado, String Users) {
        this.IdEmpleado = IdEmpleado;
        this.DPI = DPI;
        this.Nombre = Nombre;
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

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
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

    public void setUsers(String Users) {
        this.Users = Users;
    }
    
    

   
    
}
