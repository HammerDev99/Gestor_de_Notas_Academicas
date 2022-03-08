package sistemagestionnotas;

/**
 *
 * @author1 Daniel Arbeláez Álvarez
 * @author2 Sebastián Mejía Serna
 */

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class Cronograma 
{
    private int numeroActi;
    private String actividad;
    private String duracion;
    private String fechaInicio;
    private String fechaFin;

    public Cronograma(int num, String act, String dur, String fechaI, String fechaF) 
    {
        numeroActi = num;
        actividad = act;
        duracion = dur;
        fechaInicio = fechaI;
        fechaFin = fechaF;
    }
    
    public Cronograma()
    {
        numeroActi = 0;
        actividad = "";
        duracion = "";
        fechaInicio = "";
        fechaFin = "";
    }
    
    //Métodos Obtener de la Clase
    public int getNumeroActi() 
    {
        return numeroActi;
    }
    
    public String getActividad() 
    {
        return actividad;
    }
    
    public String getDuracion() 
    {
        return duracion;
    }
    
    public String getFechaInicio() 
    {
        return fechaInicio;
    }
    
    public String getFechaFin() 
    {
        return fechaFin;
    }
    
    //Métodos Asignar de la Clase
    public void setNumeroActi(int num) 
    {
        numeroActi = num;
    }    
    
    public void setActividad(String act) 
    {
        actividad = act;
    }    
    
    public void setDuracion(String dur) 
    {
        duracion = dur;
    }
    
    public void setFechaInicio(String fechaI) 
    {
        fechaInicio = fechaI;
    }
    
    public void setFechaFin(String fechaF) 
    {
        fechaFin = fechaF;
    }
    
    //Métodos que Interactúan con la Base de Datos
    public boolean guardar(Connection cn)
    {
        boolean resp = false;
        try
        {
            String sql = "INSERT INTO Cronograma(Número_Actividad,Actividad,Duración,Fecha_Inicio,Fecha_Fin)VALUES(?,?,?,?,?)";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, numeroActi);
            cmd.setString(2, actividad);
            cmd.setString(3, duracion);
            cmd.setString(4, fechaInicio);
            cmd.setString(5, fechaFin);
            
            if(!cmd.execute())
            {
                resp = true;   
            } 
            cmd.close();
        }  
        catch(Exception ex)
        {  
            System.out.println("Error al Guardar: " + ex.getMessage());
        } 
        return resp;
    }
    
  public boolean consultar(Connection cn)
  {
        boolean resp = false;
        try
        {
            String sql = "SELECT *FROM Cronograma WHERE Número_Actividad=?" ;
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, numeroActi);
            ResultSet rs = cmd.executeQuery();
           
            if(rs.next())
            {
                resp = true;
                numeroActi = rs.getInt(1);
                actividad = rs.getString(2);
                duracion = rs.getString(3);
                fechaInicio = rs.getString(4);
                fechaFin = rs.getString(5);
            } 
            cmd.close();
        } 
        catch(Exception ex)
        {
            System.out.println("Error: "+ex.getMessage());   
        } 
        return resp;
  } 
  
  public boolean eliminar(Connection cn)
  {
        boolean resp = false;
        try
        {
            String sql = "DELETE FROM Cronograma WHERE Número_Actividad=?" ;
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, numeroActi);
            
            if(!cmd.execute())
            {
                resp = true;   
            } 
            cmd.close();
        } 
        catch(Exception ex)
        {
            System.out.println("Error:" + ex.getMessage());   
        }
        return resp;
  }  
  
  public boolean modificar(Connection cn)
  {
        boolean resp = false;
        try
        {
            String sql = "UPDATE Cronograma SET Actividad=?,Duración=?,Fecha_Inicio=?,Fecha_Fin=? WHERE Número_Actividad=?" ; 
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, actividad);
            cmd.setString(2, duracion);
            cmd.setString(3, fechaInicio);
            cmd.setString(4, fechaFin);
            cmd.setInt(5, numeroActi);
  
            if(!cmd.execute())
            {
                resp = true;   
            } 
            cmd.close();
        } 
        catch(Exception ex)
        {
            System.out.println("Error: "+ex.getMessage());   
        } 
        return resp;   
  }
}
