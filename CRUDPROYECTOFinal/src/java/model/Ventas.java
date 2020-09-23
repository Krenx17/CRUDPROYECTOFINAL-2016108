package model;

import java.sql.Date;

public class Ventas {
    private int IdVentas;
    private int IdCliente;
    private int IdEmpleado;
    private String NumeroSerie;
    private Date FechaVentas;
    private Double Monto;
    private String Estado;
    
    
    public Ventas() {}

    public Ventas(int IdVentas, int IdCliente, int IdEmpleado, String NumeroSerie, Date FechaVentas, Double Monto, String Estado) {
        this.IdVentas = IdVentas;
        this.IdCliente = IdCliente;
        this.IdEmpleado = IdEmpleado;
        this.NumeroSerie = NumeroSerie;
        this.FechaVentas = FechaVentas;
        this.Monto = Monto;
        this.Estado = Estado;
    }

    public int getIdVentas() {
        return IdVentas;
    }

    public void setIdVentas(int IdVentas) {
        this.IdVentas = IdVentas;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public int getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(int IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public String getNumeroSerie() {
        return NumeroSerie;
    }

    public void setNumeroSerie(String NumeroSerie) {
        this.NumeroSerie = NumeroSerie;
    }

    public Date getFechaVentas() {
        return FechaVentas;
    }

    public void setFechaVentas(Date FechaVentas) {
        this.FechaVentas = FechaVentas;
    }

    public Double getMonto() {
        return Monto;
    }

    public void setMonto(Double Monto) {
        this.Monto = Monto;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
}