package Controlador;

import model.Cita;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Ctrl_Cita {
    private Connection conexion;

    public Ctrl_Cita(Connection conexion) {
        this.conexion = conexion;
    }

    public boolean guardarCita(Cita cita) {
        String query = "INSERT INTO citas (id_paciente, id_personal, fecha, hora, id_tipo_cita, id_estado) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = conexion.prepareStatement(query)) {
            pstmt.setInt(1, cita.getIdPaciente());
            pstmt.setInt(2, cita.getIdPersonal());
            pstmt.setDate(3, cita.toSqlDate());
            pstmt.setTime(4, cita.toSqlTime());
            pstmt.setInt(5, cita.getIdTipoCita());
            pstmt.setInt(6, cita.getIdEstado());
            
            int filasAfectadas = pstmt.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Cita> obtenerCitas() {
        List<Cita> citas = new ArrayList<>();
        String query = "SELECT * FROM citas";
        try (PreparedStatement pstmt = conexion.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                Cita cita = new Cita(
                    rs.getInt("id_cita"),
                    rs.getInt("id_paciente"),
                    rs.getInt("id_personal"),
                    rs.getDate("fecha").toLocalDate(),
                    rs.getTime("hora").toLocalTime(),
                    rs.getInt("id_tipo_cita"),
                    rs.getInt("id_estado")
                );
                citas.add(cita);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return citas;
    }

    // Aquí puedes agregar más métodos según sea necesario, como actualizarCita, eliminarCita, etc.
}