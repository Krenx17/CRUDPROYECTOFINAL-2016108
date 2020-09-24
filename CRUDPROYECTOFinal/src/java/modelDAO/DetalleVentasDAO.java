package modelDAO;

import configuration.Conexion;
import interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.DetalleVentas;


public class DetalleVentasDAO implements CRUD{
    Conexion conect = new Conexion();
    Connection con; 
    PreparedStatement ps;
    ResultSet rs;
    DetalleVentas nuevoDetalle = new DetalleVentas();
    public List listar(){
        ArrayList<DetalleVentas> listaDetalle = new ArrayList<>();
        String sql = "select * from detalles_ventas";
        try{
            con = conect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                DetalleVentas nuevoDetalle = new DetalleVentas();
                nuevoDetalle.setIdDetalleVentas(rs.getInt("idDetalleVentas"));
                nuevoDetalle.setIdVentas(rs.getInt("IdVentas"));
                nuevoDetalle.setIdProducto(rs.getInt("IdProducto"));
                nuevoDetalle.setCantidad(rs.getInt("Cantidad"));
                nuevoDetalle.setPrecioVenta(rs.getDouble("PrecioVenta"));
                listaDetalle.add(nuevoDetalle);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaDetalle;
    }


    @Override
    public DetalleVentas list(int id) {
        String sql = "select * from detalles_ventas where IdDetalleVentas=" + id;
        try{
            con = conect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                nuevoDetalle.setIdDetalleVentas(rs.getInt("idDetalleVentas"));
                nuevoDetalle.setIdVentas(rs.getInt("IdVentas"));
                nuevoDetalle.setIdProducto(rs.getInt("IdProducto"));
                nuevoDetalle.setCantidad(rs.getInt("Cantidad"));
                nuevoDetalle.setPrecioVenta(rs.getDouble("PrecioVenta"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return nuevoDetalle;
    }

    @Override
    public boolean add(DetalleVentas dtv) {
       String sql = "insert into detalles_ventas (IdVentas, IdProducto, cantidad, PrecioVenta) values ('"+dtv.getIdVentas()+"', '"+dtv.getIdProducto()+"', '"+dtv.getCantidad()+"', '"+dtv.getPrecioVenta()+"')";
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
    public boolean edit(DetalleVentas dtv) {
        String sql = "update detalles_ventas set IdVentas='"+dtv.getIdVentas()+"', IdProducto = '"+dtv.getIdProducto()+"', cantidad = '"+dtv.getCantidad()+"', PrecioVenta = '"+dtv.getPrecioVenta()+"' where idDetalleVentas = "+dtv.getIdDetalleVentas();
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
         String sql = "delete from detalles_ventas where idDetalleVentas = " +id;
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