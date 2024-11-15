package model;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

public class Cita {
    private int idCita;
    private int idPaciente;
    private int idPersonal;
    private LocalDate fecha;
    private LocalTime hora;
    private int idTipoCita;
    private int idEstado;

    public Cita(int idCita, int idPaciente, int idPersonal, LocalDate fecha, LocalTime hora, int idTipoCita, int idEstado) {
        this.idCita = idCita;
        this.idPaciente = idPaciente;
        this.idPersonal = idPersonal;
        this.fecha = fecha;
        this.hora = hora;
        this.idTipoCita = idTipoCita;
        this.idEstado = idEstado;
    }

    public Cita() {

    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getIdTipoCita() {
        return idTipoCita;
    }

    public void setIdTipoCita(int idTipoCita) {
        this.idTipoCita = idTipoCita;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public Date toSqlDate() {
        return Date.valueOf(fecha);
    }

    public Time toSqlTime() {
        return Time.valueOf(hora);
    }
}
