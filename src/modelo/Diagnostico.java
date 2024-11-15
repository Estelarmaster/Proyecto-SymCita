package model;

public class Diagnostico {
    private int idDiagnostico;
    private int idCita;
    private String descripcion;
    private String observaciones;
    private String recomendaciones;

    public Diagnostico(int idDiagnostico, int idCita, String descripcion, String observaciones, String recomendaciones) {
        this.idDiagnostico = idDiagnostico;
        this.idCita = idCita;
        this.descripcion = descripcion;
        this.observaciones = observaciones;
        this.recomendaciones = recomendaciones;
    }

    public int getIdDiagnostico() {
        return idDiagnostico;
    }

    public int getIdCita() {
        return idCita;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setIdDiagnostico(int idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }
}
