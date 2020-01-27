/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASES;
import java.util.*;

/**
 *
 * @author carlo
 */
public class Relacion {
    ArrayList<Entidad> entidades= new ArrayList<>();

    public Relacion() {
    }
    
    public Relacion(ArrayList<Entidad> entidades) {
        this.entidades = entidades;
    }

    public ArrayList<Entidad> getEntidades() {
        return entidades;
    }

    public void setEntidades(ArrayList<Entidad> entidades) {
        this.entidades = entidades;
    }
    
    
    
    
}
