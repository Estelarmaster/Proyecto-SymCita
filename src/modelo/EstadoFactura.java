package model;

public class EstadoFactura {
    private int idEstadoFactura;
    private String nombre;

    public EstadoFactura(int idEstadoFactura, String nombre) {
        this.idEstadoFactura = idEstadoFactura;
        this.nombre = nombre;
    }

    // Constructor alternativo sin idEstadoFactura, útil para cuando el ID es autoincremental
    public EstadoFactura(String nombre) {
        this.nombre = nombre;
    }

    public int getIdEstadoFactura() {
        return idEstadoFactura;
    }

    public void setIdEstadoFactura(int idEstadoFactura) {
        this.idEstadoFactura = idEstadoFactura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "EstadoFactura{" +
                "idEstadoFactura=" + idEstadoFactura +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
