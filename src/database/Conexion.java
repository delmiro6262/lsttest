
package database;

import java.sql.Connection;


public class Conexion {
    
    private final String DRIVER="com.mysql.jdbc.Driver";
    private final String URL="jdbc:mysql://localhost:3306";
    private final String DB="dbsistema";
    private final String USER="root";
    private final String PASSWORD="";
    
    public Connection cadena;
    
    public Conexion(){
        this.cadena=null;    
    }        
    
    public Connection conectar(){
    
    
    
    }
    
    public void desconectar(){
    
    
    
    }
    
}
