/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLOGICA;

import CLASES.Atributo;
import CLASES.Entidad;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author David
 */
public class VerificarDatos {
    
    //Entidad ObjEnt = new Entidad();
    
    
    
    public boolean buscarPalabrasRepetidas(Entidad ObjEnt){
        ArrayList<Atributo> ArrayAtributos = new ArrayList<Atributo>();
        ArrayAtributos = ObjEnt.getAtributos();
        String [] atributos = new String [ArrayAtributos.size()];  
        int a = 0;
        for (Atributo atr : ArrayAtributos) {
            atributos[a] = atr.getNombre();
            a++;
        }
        boolean repetidos = false;
        
        for (int i = 0; i < atributos.length; i++) {
            for (int j = i+1; j < atributos.length; j++) {
                if(atributos[i].equals(atributos[j])){
                    System.out.println("se encontraron repetidos");
                    return true;
                }
            }
        }
        return false;
    }  
    
}
