package model;

public class Proveedor {
    private int idProveedor;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private String productosSuministrados;
    private String contactoPrincipal;

    public Proveedor(int idProveedor, String nombre, String direccion, String telefono, String email, String productosSuministrados, String contactoPrincipal) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.productosSuministrados = productosSuministrados;
        this.contactoPrincipal = contactoPrincipal;
    }

    public Proveedor(String nombre, String direccion, String telefono, String email, String productosSuministrados, String contactoPrincipal) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.productosSuministrados = productosSuministrados;
        this.contactoPrincipal = contactoPrincipal;
    }

    public Proveedor() {

    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public String getProductosSuministrados() {
        return productosSuministrados;
    }

    public void setProductosSuministrados(String productosSuministrados) {
        this.productosSuministrados = productosSuministrados;
    }

    public String getContactoPrincipal() {
        return contactoPrincipal;
    }

    public void setContactoPrincipal(String contactoPrincipal) {
        this.contactoPrincipal = contactoPrincipal;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "idProveedor=" + idProveedor +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", productosSuministrados='" + productosSuministrados + '\'' +
                ", contactoPrincipal='" + contactoPrincipal + '\'' +
                '}';
    }
}
