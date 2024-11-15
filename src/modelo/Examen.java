package model;

import java.time.LocalDate;

public class Examen {
    private int idExamen;
    private int idCita;
    private String tipo;
    private String resultados;
    private LocalDate fecha;
    private String observaciones;
    private double precio;

    public Examen(int idExamen, int idCita, String tipo, String resultados, LocalDate fecha, String observaciones, double precio) {
        this.idExamen = idExamen;
        this.idCita = idCita;
        this.tipo = tipo;
        this.resultados = resultados;
        this.fecha = fecha;
        this.observaciones = observaciones;
        this.precio = precio;
    }

    // Constructor alternativo sin idExamen, útil cuando el ID es autoincremental
    public Examen(int idCita, String tipo, String resultados, LocalDate fecha, String observaciones, double precio) {
        this.idCita = idCita;
        this.tipo = tipo;
        this.resultados = resultados;
        this.fecha = fecha;
        this.observaciones = observaciones;
        this.precio = precio;
    }

    public int getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(int idExamen) {
        this.idExamen = idExamen;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getResultados() {
        return resultados;
    }

    public void setResultados(String resultados) {
        this.resultados = resultados;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Examen{" +
                "idExamen=" + idExamen +
                ", idCita=" + idCita +
                ", tipo='" + tipo + '\'' +
                ", resultados='" + resultados + '\'' +
                ", fecha=" + fecha +
                ", observaciones='" + observaciones + '\'' +
                ", precio=" + precio +
                '}';
    }
}
