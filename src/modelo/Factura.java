package model;

import java.time.LocalDate;

public class Factura {
    private int idFactura;
    private int idCita;
    private double montoTotal;
    private LocalDate fecha;
    private int idMetodoPago;
    private int idEstadoFactura;

    public Factura(int idFactura, int idCita, double montoTotal, LocalDate fecha, int idMetodoPago, int idEstadoFactura) {
        this.idFactura = idFactura;
        this.idCita = idCita;
        this.montoTotal = montoTotal;
        this.fecha = fecha;
        this.idMetodoPago = idMetodoPago;
        this.idEstadoFactura = idEstadoFactura;
    }

    // Constructor alternativo sin idFactura, útil cuando el ID es autoincremental
    public Factura(int idCita, double montoTotal, LocalDate fecha, int idMetodoPago, int idEstadoFactura) {
        this.idCita = idCita;
        this.montoTotal = montoTotal;
        this.fecha = fecha;
        this.idMetodoPago = idMetodoPago;
        this.idEstadoFactura = idEstadoFactura;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getIdMetodoPago() {
        return idMetodoPago;
    }

    public void setIdMetodoPago(int idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
    }

    public int getIdEstadoFactura() {
        return idEstadoFactura;
    }

    public void setIdEstadoFactura(int idEstadoFactura) {
        this.idEstadoFactura = idEstadoFactura;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "idFactura=" + idFactura +
                ", idCita=" + idCita +
                ", montoTotal=" + montoTotal +
                ", fecha=" + fecha +
                ", idMetodoPago=" + idMetodoPago +
                ", idEstadoFactura=" + idEstadoFactura +
                '}';
    }
}
