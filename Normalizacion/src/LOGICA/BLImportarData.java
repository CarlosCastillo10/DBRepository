/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGICA;

import CLASES.Atributo;
import CLASES.Entidad;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carlo
 */
public class BLImportarData {

    //public DefaultTableModel modeloClavesCandidatas = new DefaultTableModel();
    //public DefaultTableModel modeloClavesPrimarias = new DefaultTableModel();

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
    
    public void importarData(JTable tableUniversal){
        DefaultTableModel modelo = new DefaultTableModel();
        for (Atributo objAtributo : GLOBAL.GlobalVariables.entidadUniversal.getAtributos()) {
            modelo.addColumn(objAtributo);
        }
        tableUniversal.setModel(modelo);
    }

}
