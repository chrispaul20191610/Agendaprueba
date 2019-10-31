/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capadatos;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Fundamentos DS
 */
public class Clscontactos {
     int _numero;
     String _nombre;
     String _telefono;
     String _direccion;
     
     public Clscontactos ()
     {
         _numero = 0;
         _nombre = null;
         _telefono = null;
         _direccion = null;
         
     }

    public int getNumero() {
        return _numero;
    }

    public void setNumero(int _numero) {
        this._numero = _numero;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String getTelefono() {
        return _telefono;
    }

    public void setTelefono(String _telefono) {
        this._telefono = _telefono;
    }

    public String getDireccion() {
        return _direccion;
    }

    public void setDireccion(String _direccion) {
        this._direccion = _direccion;
    }
     
     public void leer (ResultSet contactos) throws SQLException
     {
         _numero = contactos.getInt("numero");
         _nombre = contactos.getString("nombre");
         _telefono = contactos.getString("telefono");
         _direccion = contactos.getString("direccion");
     }
    
    
}
