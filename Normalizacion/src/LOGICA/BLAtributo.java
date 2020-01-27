/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGICA;
import java.util.*;

import CLASES.Atributo;
import CLASES.Entidad;

/**
 *
 * @author carlo
 */
public class BLAtributo {
    
    public Atributo establecerPrimaryKey(Atributo objAtributo,boolean estado){
        objAtributo.setPrimaryKey(estado);
        return objAtributo;
    }
    
    public boolean validarClavePrimaria(ArrayList<Atributo> arrayClavesPrimarias){
        boolean isClavePrimaria = false;
        for (int i = 0; i < arrayClavesPrimarias.get(0).getValores().size(); i++) {
            String clavePrimaria = "";
            for (int j = 0; j < arrayClavesPrimarias.size(); j++){
                clavePrimaria = String.format("%s %s", clavePrimaria,
                        arrayClavesPrimarias.get(j).getValores().get(i));
            }
            if(establecerNumeroRepeticiones(arrayClavesPrimarias, clavePrimaria) == 1)
                isClavePrimaria = true;
            else
                isClavePrimaria = false;      
        }
         return isClavePrimaria;
    }
    
    public int establecerNumeroRepeticiones(ArrayList<Atributo> arrayClavesPrimarias,
            String clavePrimaria){
        int numRepeticiones = 0;
        for (int i = 0; i < arrayClavesPrimarias.get(0).getValores().size(); i++) {
            String valor = "";
            for (int j = 0; j < arrayClavesPrimarias.size(); j++){
                valor = String.format("%s %s", valor,
                        arrayClavesPrimarias.get(j).getValores().get(i));
            }
            if (clavePrimaria.equals(valor)){
                numRepeticiones++;
            }
        }      
        return numRepeticiones;
    }
    
}
