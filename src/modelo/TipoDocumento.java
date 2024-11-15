package model;

public class TipoDocumento {
    private int idTipoDocumento;
    private String tipo;

    public TipoDocumento(int idTipoDocumento, String tipo) {
        this.idTipoDocumento = idTipoDocumento;
        this.tipo = tipo;
    }

    public TipoDocumento(String tipo) {
        this.tipo = tipo;
    }

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "TipoDocumento{" +
                "idTipoDocumento=" + idTipoDocumento +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
