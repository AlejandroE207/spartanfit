/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import modelo.ModeloUsuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.JdbcTemplate;
/**
 *
 * @author USUARIO
 */
public class UsuarioDao {
    JdbcTemplate Jtemplate = new JdbcTemplate();
    
    public UsuarioDao(){
        ConectarBD con = new ConectarBD();
        this.Jtemplate = new JdbcTemplate(con.conectar());
    }
    
    public void consultarDatos(){
        
    }
}
