package model;

import java.time.LocalDate;

public class Receta {
    private int idReceta;
    private int idCita;
    private LocalDate fecha;
    private String instrucciones;

    // Constructor para instanciar la receta con todos los atributos
    public Receta(int idReceta, int idCita, LocalDate fecha, String instrucciones) {
        this.idReceta = idReceta;
        this.idCita = idCita;
        this.fecha = fecha;
        this.instrucciones = instrucciones;
    }

    // Constructor alternativo sin idReceta, útil cuando el ID es autoincremental
    public Receta(int idCita, LocalDate fecha, String instrucciones) {
        this.idCita = idCita;
        this.fecha = fecha;
        this.instrucciones = instrucciones;
    }

    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    @Override
    public String toString() {
        return "Receta{" +
                "idReceta=" + idReceta +
                ", idCita=" + idCita +
                ", fecha=" + fecha +
                ", instrucciones='" + instrucciones + '\'' +
                '}';
    }
}
