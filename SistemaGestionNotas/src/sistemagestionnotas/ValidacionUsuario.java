package sistemagestionnotas;
/**
 *
 * @author1 Daniel Arbeláez Álvarez
 * @author2 Sebastián Mejía Serna
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ValidacionUsuario 
{
    private String usuario;
    private int tipo;
    private String contraseña;
    DB_NotesMSA regis = new DB_NotesMSA();

    public void setUsuario(String usua)
    {
        usuario=usua;
    }
    public void setTipo(int tip)
    {
        tipo = tip;
    }
    public void setContraseña(String passw)
    {
        contraseña=passw;
    }    
   
    public boolean login()
    {
        boolean resp=false;
        Connection cn;
        regis.Conectar();
        cn = regis.getConectar();        
        try
        {
            String sql= "SELECT *FROM Persona WHERE Nombre_Usuario='" + usuario + "'AND Contraseña='" + contraseña + "' AND Tipo_Usuario=" + tipo;
            PreparedStatement cmd = cn.prepareStatement(sql);           
            ResultSet rs=cmd.executeQuery();
            
            if(rs.next())
            {
                resp = true;
                usuario = rs.getString(6);
                contraseña = rs.getString(7);
                tipo = rs.getInt(8);
            } 
            cmd.close();
      } 
      catch(Exception ex)
      {
            System.out.println("Error: "+ex.getMessage());   
      } 
      return resp;
    } 
    
}//Fin Clase
