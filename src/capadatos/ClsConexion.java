/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capadatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ClsConexion {
    
    private Connection base;
    private Statement tabla;
    private ResultSet contactos;
    
     public ClsConexion(String dirbase) {
        try {
            base = DriverManager.getConnection("jdbc:ucanaccess://" + dirbase);
            System.out.println("***CONEXIÓN EXITOSA***");
            tabla = base.createStatement(ResultSet.FETCH_UNKNOWN, ResultSet.TYPE_SCROLL_SENSITIVE);

        } catch (Exception err) {
            System.out.println("***CONEXIÓN FALLIDA***" + err);
        }

    }
     
     public ResultSet _contactos ()
             
     {
         return contactos;
     }
     
     
     public boolean consulta (String _tabla) throws SQLException
             
     {
         boolean comprobar= false;
         String comando = "SELECT * FROM "+ _tabla;
         contactos = null;
         tabla.execute(comando);
         contactos = tabla.getResultSet();
         if (contactos != null) {
            comprobar = true;
        }
        return comprobar;
     }
     
     
}
