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
public class Atributo {
    
    private String nombre;
    private boolean primaryKey;
    private ArrayList<String> valores = new ArrayList<>();

    public Atributo() {
    }
    
    public Atributo(String nombre){
        this.nombre = nombre;
        this.primaryKey = false;
    }
    public Atributo(String nombre,ArrayList<String> valores) {
        this.nombre = nombre;
        this.valores = valores;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrimaryKey(boolean primaryKey){
        this.primaryKey = primaryKey;
    }
    
    public boolean getPrimaryKey(){
        return primaryKey;
    }
    
    public ArrayList<String> getValores() {
        return valores;
    }
    
    public void setValores(ArrayList<String> valores) {
        this.valores = valores;
    }
    
    
    public void setValor(String valor){
        this.valores.add(valor);
    }
    
    
     @Override
    public String toString() {
        return String.format("%s", this.getNombre());
    }
  
}
