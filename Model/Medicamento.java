package Model;


import java.util.Date;

public class Medicamento {
    private String nombre;
    private String laboratorio;
    private String numeroLote;
    private Date fechaVencimiento;
    private int precio;
    private int cantidad;

    public Medicamento(String nombre, String laboratorio, String numeroLote, Date fechaVencimiento, int precio, int cantidad) {
        this.nombre = nombre;
        this.laboratorio = laboratorio;
        this.numeroLote = numeroLote;
        this.fechaVencimiento = fechaVencimiento;
        this.precio = precio;
        this.cantidad= cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
