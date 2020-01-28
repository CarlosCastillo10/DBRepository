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
    ArrayList<Atributo> arrayCampos = new ArrayList<>();
    BLImportarData obBLImportarData = new BLImportarData();
    
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
        arrayCampos = arrayClavePrimarias;
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
            ArrayList<JTable> arrayTables,JTable tablaUniversal,ArrayList<Atributo> clavesPrimarias){
        agregarCampos(atributosSeleccionados);
        Object[] columnas = {};
        DefaultTableModel modelo = new DefaultTableModel(null,columnas);  
        for(int i = 0; i < arrayCampos.size(); i++){
            modelo.addColumn(arrayCampos.get(i).getNombre());       
        }
        for(int i = 0; i < arrayCampos.get(0).getValores().size(); i++){
            String[] NewValor = new String[arrayCampos.size()];
            for(int j = 0; j < arrayCampos.size(); j++){
                NewValor[j] = arrayCampos.get(j).getValores().get(i);  
            }
            modelo.addRow(NewValor);                     
        }
        arrayTables.get(0).setModel(modelo);
        obBLImportarData.actualizarTablaUniversal(tablaUniversal, atributosSeleccionados, clavesPrimarias);
        
    }
    
    private void agregarCampos(ArrayList<Atributo> atributosSeleccionados){
        for (Atributo obAtributo : atributosSeleccionados) {
            arrayCampos.add(obAtributo);
        }
    }
    
}
