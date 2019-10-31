/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capadatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
     
     
}
