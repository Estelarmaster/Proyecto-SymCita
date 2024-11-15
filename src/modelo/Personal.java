package model;

public class Personal {
    private int idPersonal;
    private int idCargo;
    private int idTipoDocumento;
    private String numeroDocumento;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    public Personal(int idPersonal, int idCargo, int idTipoDocumento, String numeroDocumento, String nombre, String apellido, String telefono, String email) {
        this.idPersonal = idPersonal;
        this.idCargo = idCargo;
        this.idTipoDocumento = idTipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }

    public Personal(int idCargo, int idTipoDocumento, String numeroDocumento, String nombre, String apellido, String telefono, String email) {
        this.idCargo = idCargo;
        this.idTipoDocumento = idTipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "idPersonal=" + idPersonal +
                ", idCargo=" + idCargo +
                ", idTipoDocumento=" + idTipoDocumento +
                ", numeroDocumento='" + numeroDocumento + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
