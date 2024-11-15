package model;

public class EstadoCita {
    private int idEstado;
    private String estado;

    public EstadoCita(int idEstado, String estado) {
        this.idEstado = idEstado;
        this.estado = estado;
    }

    public EstadoCita(String estado) {
        this.estado = estado;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "EstadoCita{" +
                "idEstado=" + idEstado +
                ", estado='" + estado + '\'' +
                '}';
    }
}
