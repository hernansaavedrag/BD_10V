package controlador;

import bd.Conexion;
import java.util.Date;
import modelo.Libro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Profe Hernán
 * @version 17-11-2021
 */
public class Registro {
    
    public boolean agregar(Libro libro){
        
        Date date;
        try {
            
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            date = libro.getPublicacion();
            
            String query = "INSERT INTO libro(titulo,autor,publicacion,precio,disponible) VALUES (?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, libro.getTitulo());
            stmt.setString(2, libro.getAutor());
            stmt.setDate(3,new java.sql.Date(date.getTime()));
            stmt.setInt(4, libro.getPrecio());
            stmt.setBoolean(5, libro.isDisponible());
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al agregar Libro");
            return false;
        } catch(Exception e){
            System.out.println("Error al agregar libro");
            return false;
        }
    }
    
    public boolean actualizar(Libro libro){
        
        Date date;
        try {
            
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            date = libro.getPublicacion();
            
            String query = "UPDATE libro SET titulo=?,autor =?,publicacion=?,precio=?,disponible=? WHERE = idlibro=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, libro.getTitulo());
            stmt.setString(2, libro.getAutor());
            stmt.setDate(3,new java.sql.Date(date.getTime()));
            stmt.setInt(4, libro.getPrecio());
            stmt.setBoolean(5, libro.isDisponible());
            stmt.setInt(6, libro.getIdLibro());
            
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al Actualizar Libro");
            return false;
        } catch(Exception e){
            System.out.println("Error al Actualizar libro");
            return false;
        }
    }
    
    public boolean eliminar(int idLibro){
        
       
        try {
            
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            
            String query = "DELETE FROM libro WHERE idlibro=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1,idLibro);
 
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al eliminar Libro");
            return false;
        } catch(Exception e){
            System.out.println("Error al eliminar libro");
            return false;
        }
        
    }
    
}
