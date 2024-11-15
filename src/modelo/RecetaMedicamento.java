package model;

public class RecetaMedicamento {
    private int idRecetaMedicamento;
    private int idReceta;
    private int idMedicamento;
    private int cantidad;
    private String dosis;
    private double precio;

    // Constructor para instanciar la relación con todos los atributos
    public RecetaMedicamento(int idRecetaMedicamento, int idReceta, int idMedicamento, int cantidad, String dosis, double precio) {
        this.idRecetaMedicamento = idRecetaMedicamento;
        this.idReceta = idReceta;
        this.idMedicamento = idMedicamento;
        this.cantidad = cantidad;
        this.dosis = dosis;
        this.precio = precio;
    }

    // Constructor alternativo sin idRecetaMedicamento, útil cuando el ID es autoincremental
    public RecetaMedicamento(int idReceta, int idMedicamento, int cantidad, String dosis, double precio) {
        this.idReceta = idReceta;
        this.idMedicamento = idMedicamento;
        this.cantidad = cantidad;
        this.dosis = dosis;
        this.precio = precio;
    }

    public int getIdRecetaMedicamento() {
        return idRecetaMedicamento;
    }

    public void setIdRecetaMedicamento(int idRecetaMedicamento) {
        this.idRecetaMedicamento = idRecetaMedicamento;
    }

    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "RecetaMedicamento{" +
                "idRecetaMedicamento=" + idRecetaMedicamento +
                ", idReceta=" + idReceta +
                ", idMedicamento=" + idMedicamento +
                ", cantidad=" + cantidad +
                ", dosis='" + dosis + '\'' +
                ", precio=" + precio +
                '}';
    }
}
