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
public class Entidad {
    
    private String nombre;
    private ArrayList<Atributo> atributos = new ArrayList<Atributo>();

    public Entidad() {
    }

    public Entidad(String nombre,ArrayList<Atributo> atributos) {
        this.nombre = nombre;
        this.atributos = atributos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Atributo> getAtributos() {
        return atributos;
    }

    public void setAtributos(ArrayList<Atributo> atributos) {
        this.atributos = atributos;
    }

    @Override
    public String toString() {
        return "Entidad{" + "nombre=" + nombre + ", atributos=" + atributos + '}';
    }
    
    
    
    
}
