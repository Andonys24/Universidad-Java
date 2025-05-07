package zona_fit.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import io.github.cdimascio.dotenv.Dotenv;

public class Conexion {
    public static Connection getConexion() {
        // Cargar Variables de entorno
        Dotenv dotenv = Dotenv.load();
        Connection conexion = null;

        // Crear variables de entorno
        String baseDatos = dotenv.get("MYSQL_DATABASE");
        String usuario = dotenv.get("MYSQL_USER");
        String password = dotenv.get("MYSQL_PASSWORD");
        String host = dotenv.get("MYSQL_HOST", "localhost");
        String port = dotenv.get("MYSQL_PORT", "3306");

        // Crear url
        String url = "jdbc:mysql://" + host + ":" + port + "/" + baseDatos;

        try {
            // Intentar establecer la conexión
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch (java.sql.SQLException e) {
            // Manejar excepciones relacionadas con la conexión
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            System.err.println("Error: Driver JDBC no encontrado: " + e.getMessage());
            e.printStackTrace();
            return null;
        }

        return conexion;
    }

    public static void cerrarConexion(Connection conexion) {
        try {
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión a la base de datos: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error inesperado al cerrar la conexión: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
