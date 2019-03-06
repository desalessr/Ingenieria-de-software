/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.lab.mapita.controlador;

import is.lab.mapita.modelo.Marcador;
import is.lab.mapita.modelo.MarcadorDAO;
import java.util.Date;
import javax.faces.bean.ManagedBean;
/**
 *
 * @author Desales
 */
@ManagedBean
public class AgregaMarcador {
    
    private String descripcion;
    private double longitud;
    private double latitud;
    
    /*Constructor de un marcador*/
    public AgregaMarcador (String descripcion, double longitud, double latitud) {
        this.descripcion = descripcion;
        this.longitud = longitud;
        this.latitud = latitud; 
    }
    
    /*Devuelve la descripcion del marcador*/
    public String getDescripcion() { return descripcion; }
    /*Devuelve la latitud del marcador*/
    public double getLatitud() { return latitud; }
    /*Devuelve la longitud del marcador*/
    public double getLongitud() { return longitud; }
    /*Modifica la descripcion*/
    public void setDescripcion(String descripcion) { 
        if (descripcion.equals("") == true) /*No hay descripciones vacías*/
            return;
        this.descripcion = descripcion; 
    }
    /*Modifica la longitud del marcador*/
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
   /*Modifica la latitud del marcador*/
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
    
    /*Agrega un marcador*/
    public void agregaMarcador() {
        Marcador m = new Marcador();
        m.setDescripcion(descripcion);
        m.setLatitud(latitud);
        m.setLongitud(longitud);
        MarcadorDAO md = new MarcadorDAO();
        md.save(m);
    }
}
