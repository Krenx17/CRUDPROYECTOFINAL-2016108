package modelDAO;

import configuration.Conexion;
import interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;


public class ClienteDAO implements CRUD{
    Conexion conect = new Conexion();
    Connection con; 
    PreparedStatement ps;
    ResultSet rs;
    Cliente nuevoCliente = new Cliente();
    public List listar(){
        ArrayList<Cliente> listaCliente = new ArrayList<>();
        String sql = "select * from cliente";
        try{
            con = conect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Cliente nuevoCliente = new Cliente();
                nuevoCliente.setIdCliente(rs.getInt("IdCliente"));
                nuevoCliente.setDPI(rs.getString("DPI"));
                nuevoCliente.setNombres(rs.getString("Nombres"));
                nuevoCliente.setDireccion(rs.getString("Direccion"));
                nuevoCliente.setEstado(rs.getString("Estado"));
                listaCliente.add(nuevoCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaCliente;
    }


    @Override
    public Cliente list(int id) {
        String sql = "select * from cliente where IdCliente=" + id;
        try{
            con = conect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                nuevoCliente.setIdCliente(rs.getInt("IdCliente"));
                nuevoCliente.setDPI(rs.getString("DPI"));
                nuevoCliente.setNombres(rs.getString("Nombres"));
                nuevoCliente.setDireccion(rs.getString("Direccion"));
                nuevoCliente.setEstado(rs.getString("Estado"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return nuevoCliente;
    }

    @Override
    public boolean add(Cliente cli) {
       String sql = "insert into cliente (DPI, Nombres, Direccion, Estado) values ('"+cli.getDPI()+"', '"+cli.getNombres()+"', '"+cli.getDireccion()+"', '"+cli.getEstado()+"')";
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
    public boolean edit(Cliente cli) {
        String sql = "update cliente set DPI='"+cli.getDPI()+"', Nombres = '"+cli.getNombres()+"', Direccion = '"+cli.getDireccion()+"', Estado = '"+cli.getEstado()+"' where IdEmpleado = "+cli.getIdCliente();
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
         String sql = "delete from cliente where IdCliente =" +id;
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