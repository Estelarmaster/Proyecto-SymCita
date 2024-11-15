package Controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class Ctrl_Usuario {
    
    public boolean loginUser(Usuario objeto) {
        boolean respuesta = false;
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            cn = Conexion.conectar();
            String sql = "SELECT numero_documento, contrasena FROM Usuario WHERE nombreUsuario = ? AND contrasena = ?";
            pst = cn.prepareStatement(sql);
            pst.setString(1, objeto.getNombreUsuario());
            pst.setString(2, objeto.getContrasena());
            rs = pst.executeQuery();
            
            if (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al iniciar sesión: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al Iniciar Sesión");
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (cn != null) cn.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        
        return respuesta;
    }
}