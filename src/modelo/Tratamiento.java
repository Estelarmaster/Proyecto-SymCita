package model;

public class Tratamiento {
    private int idTratamiento;
    private int idDiagnostico;
    private String listaMedicamentos;
    private String dosis;
    private String frecuencia;
    private String duracion;
    private double precio;

    public Tratamiento(int idTratamiento, int idDiagnostico, String listaMedicamentos, String dosis,
                       String frecuencia, String duracion, double precio) {
        this.idTratamiento = idTratamiento;
        this.idDiagnostico = idDiagnostico;
        this.listaMedicamentos = listaMedicamentos;
        this.dosis = dosis;
        this.frecuencia = frecuencia;
        this.duracion = duracion;
        this.precio = precio;
    }

    public Tratamiento(int idDiagnostico, String listaMedicamentos, String dosis,
                       String frecuencia, String duracion, double precio) {
        this.idDiagnostico = idDiagnostico;
        this.listaMedicamentos = listaMedicamentos;
        this.dosis = dosis;
        this.frecuencia = frecuencia;
        this.duracion = duracion;
        this.precio = precio;
    }

    public int getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public int getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(int idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public String getListaMedicamentos() {
        return listaMedicamentos;
    }

    public void setListaMedicamentos(String listaMedicamentos) {
        this.listaMedicamentos = listaMedicamentos;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tratamiento{" +
                "idTratamiento=" + idTratamiento +
                ", idDiagnostico=" + idDiagnostico +
                ", listaMedicamentos='" + listaMedicamentos + '\'' +
                ", dosis='" + dosis + '\'' +
                ", frecuencia='" + frecuencia + '\'' +
                ", duracion='" + duracion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
