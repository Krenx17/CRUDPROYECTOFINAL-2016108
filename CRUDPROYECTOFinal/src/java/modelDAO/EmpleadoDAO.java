package modelDAO;

import configuration.Conexion;
import interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Empleado;


public class EmpleadoDAO implements CRUD{
    Conexion conect = new Conexion();
    Connection con; 
    PreparedStatement ps;
    ResultSet rs;
    Empleado nuevoEmpleado = new Empleado();
    public List listar(){
        ArrayList<Empleado> listaEmpleado = new ArrayList<>();
        String sql = "select * from empleado";
        try{
            con = conect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Empleado nuevoEmpleado = new Empleado();
                nuevoEmpleado.setIdEmpleado(rs.getInt("IdEmpleado"));
                nuevoEmpleado.setDPI(rs.getString("DPI"));
                nuevoEmpleado.setNombres(rs.getString("Nombres"));
                nuevoEmpleado.setTelefono(rs.getString("Telefono"));
                nuevoEmpleado.setEstado(rs.getString("Estado"));
                nuevoEmpleado.setUser(rs.getString("Users"));
                listaEmpleado.add(nuevoEmpleado);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaEmpleado;
    }


    @Override
    public Empleado list(int id) {
        String sql = "select * from empleado where IdEmpleado=" + id;
        try{
            con = conect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                nuevoEmpleado.setIdEmpleado(rs.getInt("IdEmpleado"));
                nuevoEmpleado.setDPI(rs.getString("DPI"));
                nuevoEmpleado.setNombres(rs.getString("Nombres"));
                nuevoEmpleado.setTelefono(rs.getString("Telefono"));
                nuevoEmpleado.setEstado(rs.getString("Estado"));
                nuevoEmpleado.setUser(rs.getString("Users"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return nuevoEmpleado;
    }

    @Override
    public boolean add(Empleado emp) {
       String sql = "insert into empelado (DPI, Nombres, Telefono, Estado, Users) values ('"+emp.getDPI()+"', '"+emp.getNombres()+"', '"+emp.getTelefono()+"', '"+emp.getEstado()+"', '"+emp.getUser()+"')";
       try{
           con = conect.getConnection();
           ps = con.prepareStatement(sql);
           ps.executeUpdate();
       }catch(Exception e){
           e.printStackTrace();
       }
       return false;
    }

    @Override
    public boolean edit(Empleado emp) {
        String sql = "update empleado set DPI='"+emp.getDPI()+"', Nombres = '"+emp.getNombres()+"', Telefono = '"+emp.getTelefono()+"', Estado = '"+emp.getEstado()+"', Users = '"+emp.getUser()+"' where IdEmpleado ="+emp.getIdEmpleado();
        try{
           con = conect.getConnection();
           ps = con.prepareStatement(sql);
           ps.executeUpdate();
       }catch(Exception e){
           e.printStackTrace();
       }
       return false;
    }

    @Override
    public boolean eliminar(int id) {
         String sql = "delete from empleado where IdEmpleado =" +id;
        try{
           con = conect.getConnection();
           ps = con.prepareStatement(sql);
           ps.executeUpdate();
       }catch(Exception e){
           e.printStackTrace();
       }
        return false;
    }

}