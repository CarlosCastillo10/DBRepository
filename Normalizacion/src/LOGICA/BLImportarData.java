/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGICA;

import CLASES.Atributo;
import CLASES.Entidad;
import DATA.DataImportar;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carlo
 */
public class BLImportarData {

    public void obtenerClavesCandidatas(JTable tableClavesCandidatas, Entidad objEntidad) {
        Object[] columnas = {""};
        DefaultTableModel modeloClavesCandidatas = new DefaultTableModel(null, columnas);

        for (Atributo objAtributo : objEntidad.getAtributos()) {
            Atributo NewValor[] = {objAtributo};
            modeloClavesCandidatas.addRow(NewValor);
        }
        tableClavesCandidatas.setModel(modeloClavesCandidatas);
    }

    public void establecerClavesPrimarias(JTable tableClavesPrimarias,
            ArrayList<Atributo> atributos) {
        Object[] columnas= {""};
        DefaultTableModel modeloClavesPrimarias = new DefaultTableModel(null,columnas);
        for (Atributo objAtributo : atributos) {
            Atributo NewValor[] = {objAtributo};
            modeloClavesPrimarias.addRow(NewValor);
        }
        tableClavesPrimarias.setModel(modeloClavesPrimarias);
    }
    
    public void establecerClavesCandidatas(JTable tableClavesCandidatas,
            ArrayList<Atributo> atributos) {
        Object[] columnas= {""};
        DefaultTableModel modeloClavesCandidatas = new DefaultTableModel(null,columnas);
        for (Atributo objAtributo : atributos) {
            Atributo NewValor[] = {objAtributo};
            modeloClavesCandidatas.addRow(NewValor);
        }
        tableClavesCandidatas.setModel(modeloClavesCandidatas);
    }
    
    public void importarData(JTable tableUniversal,ArrayList<Atributo> clavesPrimarias){
        DefaultTableModel modelo = new DefaultTableModel();
        for (Atributo objAtributo : DataImportar.atributos) {
            modelo.addColumn(objAtributo);
        }
        for (int i = 0; i <DataImportar.atributos.get(0).getValores().size(); i++) {
            String[] NewValor = new String[DataImportar.atributos.size()];
            for (int j = 0; j < DataImportar.atributos.size(); j++){
                NewValor[j] = DataImportar.atributos.get(j).getValores().get(i);
            }     
            modelo.addRow(NewValor);
        }
        tableUniversal.setModel(modelo);
        for (int i = 0; i < clavesPrimarias.size(); i++) {
            for (int j = 0; j < DataImportar.atributos.size(); j++){
                if(clavesPrimarias.get(i).getNombre().equals(DataImportar.atributos.get(j).getNombre())){
                    DataImportar.atributos.get(j).setPrimaryKey(true);
                }
            } 
        }
        System.out.println(DataImportar.atributos);
        
    }
    

}
