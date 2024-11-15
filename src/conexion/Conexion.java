package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection conectar() {
        Connection cn = null;
        try {
            // Cargar el controlador MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // URL de conexión a MySQL (ajusta el nombre de la base de datos, usuario y contraseña)
            String url = "jdbc:mysql://localhost:3306/syncita_db?useSSL=false&serverTimezone=UTC";
            String usuario = "root@localhost";
            String contraseña = "DavidLibre16*";

            // Establecer la conexión
            cn = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexión establecida con la base de datos MySQL.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: Controlador MySQL no encontrado.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error en la conexión: " + e.getMessage());
            e.printStackTrace();
        }
        return cn; // Devuelve la conexión establecida o null en caso de error
    }
}
