package model;

import java.time.LocalTime;

public class Horario {
    private int idHorario;
    private int idPersonal;
    private int idDiaSemana;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private boolean disponibilidad;

    public Horario(int idHorario, int idPersonal, int idDiaSemana, LocalTime horaInicio, LocalTime horaFin, boolean disponibilidad) {
        this.idHorario = idHorario;
        this.idPersonal = idPersonal;
        this.idDiaSemana = idDiaSemana;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.disponibilidad = disponibilidad;
    }

    public Horario(int idPersonal, int idDiaSemana, LocalTime horaInicio, LocalTime horaFin, boolean disponibilidad) {
        this.idPersonal = idPersonal;
        this.idDiaSemana = idDiaSemana;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.disponibilidad = disponibilidad;
    }

    public Horario() {

    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    public int getIdDiaSemana() {
        return idDiaSemana;
    }

    public void setIdDiaSemana(int idDiaSemana) {
        this.idDiaSemana = idDiaSemana;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Horario{" +
                "idHorario=" + idHorario +
                ", idPersonal=" + idPersonal +
                ", idDiaSemana=" + idDiaSemana +
                ", horaInicio=" + horaInicio +
                ", horaFin=" + horaFin +
                ", disponibilidad=" + disponibilidad +
                '}';
    }
}
