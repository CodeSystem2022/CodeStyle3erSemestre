package UTN.datos;

import UTN.dominio.Estudiante;

import static UTN.conexion.Conexion.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {
    //Método listar
    public List<Estudiante> listarEstudiantes(){
        List<Estudiante> estudiantes = new ArrayList<>();
        // Creamos algunos objetos que son necesarios para comunicarnosa con la base de datos
        PreparedStatement ps; // Envia la sentencia a la BD
        ResultSet rs; // Obtenemos el resultado de la BD
        // Creamos un objeto de tipo conexión
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes2022 ORDER BY idestudiantes2022";
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                var estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt("idestudiantes2022"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                // Falta agregarlo a la lista
                estudiantes.add(estudiante);
            }
        } catch (Exception e){
            System.out.println("Ocurrió un error al seleccionar datos: "+e.getMessage());
        }
        finally {
            try{
                con.close();
            } catch (Exception e){
                System.out.println("Ocurrió un error al cerrar la conexión: "+e.getMessage());
            }
        } // fin finally
        return estudiantes;
    } //Fin método listar

    //Métdodo por id -> fin by id
    public boolean buscarEstudiantePorId(Estudiante estudiante){
            PreparedStatement ps;
            ResultSet re;
            Connection con = getConnection();
            String sql = "SELECT * FROM estudiantes2022 WHERE idestudiantes2022=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante())
            rs = ps.executeQuery();
            if(rs.next()){
                    estudiante.setNombre(rs.getString("nombre"));
                    estudiante.setApellido(rs.getString("apellido"));
                    estudiante.setTelefono(rs.getString("telefono"));
                    estudiante.setEmail(rs.getString("email"));
                    return true // se encontrp un registro
            } // fin if
        }catch(Exception e){
            System.out.println("Ocurrió un error al buscar estudiante: " +e.getMessage());
        }// fin catch
        finally{
            try{
                con.close();
            }catch(Exception e){
                System.out.println("ocurrió un error al cerrar la conexión: "+e.getMessage());

            }//fin catch

        }//fin fynally
        return false;
    }

    public static void main(String[] args){
        //listar los estudiantes
        var EstudianteDao = new EstudianteDAO();
        System.out.println("Listado de estudiantes: ");
        List<Estudiante> estudiantes = EstudianteDAO.listarEstudiantes();
        estudiantes.forEach(System.out::println); // Función lambda para imprimir
    }

}