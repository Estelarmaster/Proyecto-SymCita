package model;

import java.time.LocalDate;

public class Paciente {
    private int idPaciente;
    private int idTipoDocumento;
    private String numeroDocumento;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private int idGenero;
    private String direccionDeResidencia;
    private String ocupacion;
    private int edad;
    private String telefono;
    private String email;
    private String eps;

    public Paciente(int idPaciente, int idTipoDocumento, String numeroDocumento, String nombre, String apellido,
                    LocalDate fechaNacimiento, int idGenero, String direccionDeResidencia, String ocupacion,
                    int edad, String telefono, String email, String eps) {
        this.idPaciente = idPaciente;
        this.idTipoDocumento = idTipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.idGenero = idGenero;
        this.direccionDeResidencia = direccionDeResidencia;
        this.ocupacion = ocupacion;
        this.edad = edad;
        this.telefono = telefono;
        this.email = email;
        this.eps = eps;
    }

    public Paciente() {

    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public String getDireccionDeResidencia() {
        return direccionDeResidencia;
    }

    public void setDireccionDeResidencia(String direccionDeResidencia) {
        this.direccionDeResidencia = direccionDeResidencia;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "idPaciente=" + idPaciente + //1
                ", idTipoDocumento=" + idTipoDocumento + //2
                ", numeroDocumento='" + numeroDocumento + '\'' + //3
                ", nombre='" + nombre + '\'' + //4
                ", apellido='" + apellido + '\'' + //5
                ", fechaNacimiento=" + fechaNacimiento + //6
                ", idGenero=" + idGenero + //7
                ", direccionDeResidencia='" + direccionDeResidencia + '\'' + //8
                ", ocupacion='" + ocupacion + '\'' + //9
                ", edad=" + edad + //10
                ", telefono='" + telefono + '\'' + //11
                ", email='" + email + '\'' + //12
                ", eps='" + eps + '\'' + //13
                '}';
    }


}
