package model;

import java.math.BigDecimal;

public class TipoCita {
    private int idTipoCita;
    private String tipo;
    private BigDecimal precio;

    public TipoCita(int idTipoCita, String tipo, BigDecimal precio) {
        this.idTipoCita = idTipoCita;
        this.tipo = tipo;
        this.precio = precio;
    }

    public TipoCita(String tipo, BigDecimal precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    public int getIdTipoCita() {
        return idTipoCita;
    }

    public void setIdTipoCita(int idTipoCita) {
        this.idTipoCita = idTipoCita;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "TipoCita{" +
                "idTipoCita=" + idTipoCita +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
