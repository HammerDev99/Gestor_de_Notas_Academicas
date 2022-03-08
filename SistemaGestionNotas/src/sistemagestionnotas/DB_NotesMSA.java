package sistemagestionnotas;
/**
 * @author  Daniel Arbeláez Álvarez
 * @author2 Sebastián Mejía Serna
 */

import javax.swing.table.DefaultTableModel;
import java.sql.ResultSetMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class DB_NotesMSA 
{
    Connection CN;
    
    public DB_NotesMSA()
    {
        CN = null;
    }
    
    public Connection getConectar()
    {
        return CN;
    }
    
    public boolean Conectar()
    {
        boolean respuesta = false;
        String BD = "DB_NotesMSA";
        String direc="jdbc:sqlserver://Estudiante;databaseName=" + BD + ";user=sa;password=3618386";
        //String direc="jdbc:sqlserver://SebasMS;databaseName=" + BD + ";user=sa;password=3618386";
        
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");        
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println("Error del Driver");
            System.out.println(ex.getMessage());
            System.exit(1);
        }
        
        try
        {
            CN = DriverManager.getConnection(direc);
            respuesta = true;
        }
        catch(SQLException ex)
        {
            System.out.println("Error al Conectar");
            System.out.println(ex.getMessage());
            System.exit(1);
        }
        System.out.println("Conexión lista a " + BD);
        return respuesta;
    }
    
    public static void configuraColumnas(final ResultSet rs, final DefaultTableModel modelo)
    {
       try
        {
            ResultSetMetaData metaDatos = rs.getMetaData();
            int numeroColumnas = metaDatos.getColumnCount();
            Object[] etiquetas = new Object[numeroColumnas];
            for (int i = 0; i < numeroColumnas; i++)
            {
                     etiquetas[i] = metaDatos.getColumnLabel(i + 1);
            }
            modelo.setColumnIdentifiers(etiquetas);
      }
      catch (Exception e)
      {
            e.printStackTrace();
      }
    } 
    private static void borrarFilasModelo(final DefaultTableModel modelo)
    {
        try
        {
              while (modelo.getRowCount() > 0)
              {	
                    modelo.removeRow(0);
              }
               
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void adicionarFilasModelo(ResultSet rs,DefaultTableModel modelo)
    {
        int numeroFila = 0;
        try
        {
            while (rs.next())
            {
                Object[] datosFila = new Object[modelo.getColumnCount()];
                for (int i = 0; i < modelo.getColumnCount(); i++)
                {
                	datosFila[i] = rs.getObject(i + 1);
                }                    
                modelo.addRow(datosFila);
                numeroFila++;
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public ResultSet consultar(String consulta)
    {
        ResultSet rs = null;  
        try
        {
            Statement s = CN.createStatement();
            rs = (ResultSet) s.executeQuery(consulta.trim());
        } catch (Exception e)
        {
          e.printStackTrace();
        }
        return rs;
    }
    
    public void listar(String s, DefaultTableModel modelo)
    {
       java.sql.ResultSet rs =consultar(s);
       if( rs!=null)
       {    
        mostrarRs(rs, modelo);
       }   
    }    
    
    public void mostrarRs(ResultSet rs, DefaultTableModel modelo)
    {
        configuraColumnas(rs, modelo);
        borrarFilasModelo(modelo);
        adicionarFilasModelo(rs, modelo);
    }
    
    //Métodos de la Tabla Cronograma
    public boolean consultarActividad(Cronograma crono)
    {
        return crono.consultar(CN);        
    }
    public boolean eliminarActividad(Cronograma crono)
    {
        return crono.eliminar(CN);
    }
    public boolean guardarActividad(Cronograma crono)
    {
        return crono.guardar(CN);
    }
    public boolean modificarActividad(Cronograma crono)
    {
        return crono.modificar(CN);
    }
}
