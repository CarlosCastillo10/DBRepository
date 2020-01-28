/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGICA;

import CLASES.Atributo;
import CLASES.Entidad;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carlo
 */
public class BLPrimeraFormaNormal {
    ArrayList<Atributo> arrayClavePrimarias = new ArrayList<>();
    
    public ArrayList<Atributo> obtenerCamposRepeticion(JTable tableClavesCandidatas) {
        ArrayList<Atributo> camposRepeticion = new ArrayList<>();
        Object[] columnas = {""};
        DefaultTableModel modeloClavesCandidatas = new DefaultTableModel(null, columnas);

        for (Atributo objAtributo : DATA.DataImportar.atributos) {
            if(!objAtributo.getPrimaryKey()){
                Atributo NewValor[] = {objAtributo};
                modeloClavesCandidatas.addRow(NewValor);
                camposRepeticion.add(objAtributo);
            }else
                arrayClavePrimarias.add(objAtributo);
        }
        tableClavesCandidatas.setModel(modeloClavesCandidatas);
        return camposRepeticion;
    }

    public void establecerCamposSeleccionados(JTable tableCamposSeleccionados,
            ArrayList<Atributo> atributos) {
        Object[] columnas= {""};
        DefaultTableModel modeloCamposSeleccionados = new DefaultTableModel(null,columnas);
        for (Atributo objAtributo : atributos) {
            Atributo NewValor[] = {objAtributo};
            modeloCamposSeleccionados.addRow(NewValor);
        }
        tableCamposSeleccionados.setModel(modeloCamposSeleccionados);
    }
    
    public void establecerCamposRepeticion(JTable tableCamposRepeticion,
            ArrayList<Atributo> atributos) {
        Object[] columnas= {""};
        DefaultTableModel modeloCamposRepeticion = new DefaultTableModel(null,columnas);
        for (Atributo objAtributo : atributos) {
            Atributo NewValor[] = {objAtributo};
            modeloCamposRepeticion.addRow(NewValor);
        }
        tableCamposRepeticion.setModel(modeloCamposRepeticion);
    }
    
    public void aplicarPrimeraForma(ArrayList<Atributo> atributosSeleccionados,
            ArrayList<JTable> arrayTables){
        DefaultTableModel modelo = new DefaultTableModel();  
        for(int i = 0; i < atributosSeleccionados.size(); i++){
            for (int j = 0; j < arrayClavePrimarias.size(); j++){
                modelo.addColumn(arrayClavePrimarias.get(j).getNombre());
            }
            modelo.addColumn(atributosSeleccionados.get(i).getNombre());
        }
        arrayTables.get(0).setModel(modelo);
    }
    
}
