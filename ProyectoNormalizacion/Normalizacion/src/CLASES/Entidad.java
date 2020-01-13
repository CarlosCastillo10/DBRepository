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
    
    private ArrayList<Atributo> atributos = new ArrayList<Atributo>();

    public Entidad() {
    }
    
    public Entidad(ArrayList<Atributo> atributos) {
        this.atributos = atributos;
    }

    public ArrayList<Atributo> getAtributos() {
        return atributos;
    }

    public void setAtributos(ArrayList<Atributo> atributos) {
        this.atributos = atributos;
    }
    
    
    
    
    
}
