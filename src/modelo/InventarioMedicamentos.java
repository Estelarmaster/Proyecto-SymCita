package model;

import java.time.LocalDate;

public class InventarioMedicamentos {
    private int idInventario;
    private String nombreMedicamento;
    private int cantidad;
    private LocalDate fechaCaducidad;
    private int idProveedor;

    public InventarioMedicamentos(int idInventario, String nombreMedicamento, int cantidad, LocalDate fechaCaducidad, int idProveedor) {
        this.idInventario = idInventario;
        this.nombreMedicamento = nombreMedicamento;
        this.cantidad = cantidad;
        this.fechaCaducidad = fechaCaducidad;
        this.idProveedor = idProveedor;
    }

    // Constructor alternativo sin idInventario, útil cuando el ID es autoincremental
    public InventarioMedicamentos(String nombreMedicamento, int cantidad, LocalDate fechaCaducidad, int idProveedor) {
        this.nombreMedicamento = nombreMedicamento;
        this.cantidad = cantidad;
        this.fechaCaducidad = fechaCaducidad;
        this.idProveedor = idProveedor;
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    @Override
    public String toString() {
        return "InventarioMedicamentos{" +
                "idInventario=" + idInventario +
                ", nombreMedicamento='" + nombreMedicamento + '\'' +
                ", cantidad=" + cantidad +
                ", fechaCaducidad=" + fechaCaducidad +
                ", idProveedor=" + idProveedor +
                '}';
    }
}
