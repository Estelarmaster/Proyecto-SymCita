package model;

import java.math.BigDecimal;

public class Medicamento {
    private int idMedicamento;
    private String nombre;
    private String descripcion;
    private int idProveedor;
    private BigDecimal precio;

    public Medicamento(int idMedicamento, String nombre, String descripcion, int idProveedor, BigDecimal precio) {
        this.idMedicamento = idMedicamento;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idProveedor = idProveedor;
        this.precio = precio;
    }

    // Constructor alternativo sin idMedicamento, útil cuando el ID es autoincremental
    public Medicamento(String nombre, String descripcion, int idProveedor, BigDecimal precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idProveedor = idProveedor;
        this.precio = precio;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "idMedicamento=" + idMedicamento +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", idProveedor=" + idProveedor +
                ", precio=" + precio +
                '}';
    }
}
