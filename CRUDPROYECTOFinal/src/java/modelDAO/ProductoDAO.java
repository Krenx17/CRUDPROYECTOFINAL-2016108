package modelDAO;

import configuration.Conexion;
import interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Producto;


public class ProductoDAO implements CRUD{
    Conexion conect = new Conexion();
    Connection con; 
    PreparedStatement ps;
    ResultSet rs;
    Producto nuevoProducto = new Producto();
    public List listar(){
        ArrayList<Producto> listaProducto = new ArrayList<>();
        String sql = "select * from producto";
        try{
            con = conect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Producto nuevoProducto = new Producto();
                nuevoProducto.setIdProducto(rs.getInt("IdProducto"));
                nuevoProducto.setNombre(rs.getString("DPI"));
                nuevoProducto.setPrecio(rs.getDouble("Precio"));
                nuevoProducto.setStock(rs.getInt("Stock"));
                nuevoProducto.setEstado(rs.getString("Estado"));
                listaProducto.add(nuevoProducto);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaProducto;
    }


    @Override
    public Producto list(int id) {
        String sql = "select * from producto where IdProducto=" + id;
        try{
            con = conect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                nuevoProducto.setIdProducto(rs.getInt("IdProducto"));
                nuevoProducto.setNombre(rs.getString("DPI"));
                nuevoProducto.setPrecio(rs.getDouble("Precio"));
                nuevoProducto.setStock(rs.getInt("Stock"));
                nuevoProducto.setEstado(rs.getString("Estado"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return nuevoProducto;
    }

    @Override
    public boolean add(Producto pr) {
       String sql = "insert into producto (Nombre, precio, Stock, Estado) values ('"+pr.getNombre()+"', '"+pr.getPrecio()+"', '"+pr.getStock()+"', '"+pr.getEstado()+"')";
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
    public boolean edit(Producto pr) {
        String sql = "update producto set Nombre='"+pr.getNombre()+"', precio= '"+pr.getPrecio()+"', Stock = '"+pr.getStock()+"', Estado = '"+pr.getEstado()+"' where IdProducto = "+pr.getIdProducto();
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
         String sql = "delete from producto where IdProducto =" +id;
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