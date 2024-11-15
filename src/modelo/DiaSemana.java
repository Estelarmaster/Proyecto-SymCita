package model;

public class DiaSemana {
    private int idDiaSemana;
    private String dia;

    public DiaSemana(int idDiaSemana, String dia) {
        this.idDiaSemana = idDiaSemana;
        this.dia = dia;
    }

    public int getIdDiaSemana() {
        return idDiaSemana;
    }

    public void setIdDiaSemana(int idDiaSemana) {
        this.idDiaSemana = idDiaSemana;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "DiaSemana{" +
                "idDiaSemana=" + idDiaSemana +
                ", dia='" + dia + '\'' +
                '}';
    }
}
