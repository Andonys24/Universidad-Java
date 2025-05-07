package zona_fit.datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

import zona_fit.conexion.Conexion;
import zona_fit.dominio.Cliente;

public class ClienteDAO implements IClienteDAO {
    @Override
    public List<Cliente> listaClientes() {
        List<Cliente> clientes = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection conexion = Conexion.getConexion();
        String sql = "SELECT * FROM cliente ORDER BY id;";

        try {
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Cliente nuevoCliente = new Cliente();
                nuevoCliente.setId(rs.getInt("id"));
                nuevoCliente.setNombre(rs.getString("nombre"));
                nuevoCliente.setApellido(rs.getString("apellido"));
                nuevoCliente.setMembresia(rs.getInt("membresia"));
                clientes.add(nuevoCliente);
            }

        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta SQL: " + e.getMessage());
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Error: Conexión a la base de datos no inicializada: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error inesperado al listar los clientes: " + e.getMessage());
            e.printStackTrace();
        } finally {
            Conexion.cerrarConexion(conexion);
        }

        return clientes;
    }

    @Override
    public boolean buscarClienteId(Cliente cliente) {
        boolean encontrado = false;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = null;

        try {
            conexion = Conexion.getConexion();

            String sql = "SELECT * FROM cliente WHERE id = ?;";
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, cliente.getId());
            rs = ps.executeQuery();

            if (rs.next()) { // Si hay registro
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setMembresia(rs.getInt("membresia"));
                encontrado = true;
            }

        } catch (SQLException e) {
            System.err.println("Error al ejecutar la consulta SQL: " + e.getMessage());
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.err.println("Error: Objeto nulo encontrado: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Error inesperado al buscar el cliente por ID: " + e.getMessage());
            e.printStackTrace();
        } finally {
            Conexion.cerrarConexion(conexion);
        }

        return encontrado;
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        boolean agregado = false;
        PreparedStatement ps = null;
        Connection conexion = null;
        String sql = "INSERT INTO cliente (nombre, apellido, membresia) VALUES (?, ?, ?);";

        try {
            conexion = Conexion.getConexion();
            if (conexion == null) {
                throw new SQLException("La conexión a la base de datos no está disponible.");
            }

            ps = conexion.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setInt(3, cliente.getMembresia());
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                agregado = true;
            }

        } catch (SQLException e) {
            System.err.println("Error al ejecutar la consulta SQL: " + e.getMessage());
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.err.println("Error: Objeto nulo encontrado: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Error inesperado al agregar el cliente: " + e.getMessage());
            e.printStackTrace();
        } finally {
            Conexion.cerrarConexion(conexion);
        }

        return agregado;
    }

    @Override
    public boolean modificarCliente(Cliente cliente) {
        boolean modificado = false;
        PreparedStatement ps = null;
        Connection conexion = Conexion.getConexion();
        String sql = "UPDATE cliente SET nombre = ?, apellido = ?, membresia = ? WHERE id = ?;";

        try {

            ps = conexion.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setInt(3, cliente.getMembresia());
            ps.setInt(4, cliente.getId());
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                modificado = true;
            }
        } catch (SQLException e) {
            System.err.println("Error al ejecutar la consulta SQL: " + e.getMessage());
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.err.println("Error: Objeto nulo encontrado: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Error inesperado al modificar el cliente: " + e.getMessage());
            e.printStackTrace();
        } finally {
            Conexion.cerrarConexion(conexion);
        }

        return modificado;
    }

    @Override
    public boolean eliminarCliente(Cliente cliente) {
        boolean eliminado = false;
        PreparedStatement ps;
        Connection conexion = Conexion.getConexion();
        String sql = "DELETE FROM cliente WHERE id = ?;";

        try {

            ps = conexion.prepareStatement(sql);
            ps.setInt(1, cliente.getId());
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                eliminado = true;
            }
        } catch (SQLException e) {
            System.err.println("Error al ejecutar la consulta SQL: " + e.getMessage());
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.err.println("Error: Objeto nulo encontrado: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Error inesperado al eliminar el cliente: " + e.getMessage());
            e.printStackTrace();
        } finally {
            Conexion.cerrarConexion(conexion);
        }

        return eliminado;
    }

}
