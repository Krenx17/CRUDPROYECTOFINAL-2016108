package modelDAO;

import configuration.Conexion;
import interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Ventas;


public class VentasDAO implements CRUD{
    Conexion conect = new Conexion();
    Connection con; 
    PreparedStatement ps;
    ResultSet rs;
    Ventas nuevaVenta = new Ventas();
    public List listar(){
        ArrayList<Ventas> listaVentas = new ArrayList<>();
        String sql = "select * from ventas";
        try{
            con = conect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Ventas nuevaVenta = new Ventas();
                nuevaVenta.setIdVentas(rs.getInt("IdVentas"));
                nuevaVenta.setIdCliente(rs.getInt("IdCliente"));
                nuevaVenta.setIdEmpleado(rs.getInt("IdEmpleado"));
                nuevaVenta.setNumeroSerie(rs.getString("NumeroSerie"));
                nuevaVenta.setFechaVentas(rs.getDate("FechaVentas"));
                nuevaVenta.setMonto(rs.getDouble("Monto"));
                nuevaVenta.setEstado(rs.getString("Estado"));
                listaVentas.add(nuevaVenta);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaVentas;
    }


    @Override
    public Ventas list(int id) {
        String sql = "select * from ventas where IdVentas=" + id;
        try{
            con = conect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                nuevaVenta.setIdVentas(rs.getInt("IdVentas"));
                nuevaVenta.setIdCliente(rs.getInt("IdCliente"));
                nuevaVenta.setIdEmpleado(rs.getInt("IdEmpleado"));
                nuevaVenta.setNumeroSerie(rs.getString("NumeroSerie"));
                nuevaVenta.setFechaVentas(rs.getDate("FechaVentas"));
                nuevaVenta.setMonto(rs.getDouble("Monto"));
                nuevaVenta.setEstado(rs.getString("Estado"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return nuevaVenta;
    }

    @Override
    public boolean add(Ventas vnt) {
       String sql = "insert into ventas (IdCliente, IdEmpleado, NumeroSerie, FechaVentas, Monto, Estado) values ('"+vnt.getIdCliente()+"', '"+vnt.getIdEmpleado()+"', '"+vnt.getNumeroSerie()+"', '"+vnt.getFechaVentas()+"', '"+vnt.getMonto()+"', '"+vnt.getEstado()+"')";
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
    public boolean edit(Ventas vnt) {
        String sql = "update ventas set IdCliente='"+vnt.getIdCliente()+"', IdEmpleado = '"+vnt.getIdEmpleado()+"', NumeroSerie = '"+vnt.getNumeroSerie()+"', FechaVentas = '"+vnt.getFechaVentas()+"', Monto = '"+vnt.getMonto()+"', Estado = '"+vnt.getEstado()+"' where IdVentas = "+vnt.getIdVentas();
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
         String sql = "delete from ventas where IdVentas =" +id;
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