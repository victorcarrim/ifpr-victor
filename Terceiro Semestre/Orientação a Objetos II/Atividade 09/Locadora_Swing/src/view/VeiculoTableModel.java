/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.Veiculo;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author victorferrari
 */
public class VeiculoTableModel extends AbstractTableModel{
    public static final int COL_CODIGO = 0;
    public static final int COL_MARCA = 1;
    public static final int COL_MODELO = 2;
    public static final int COL_CHASSI = 3;
    public static final int COL_ANO = 4;
    
    public ArrayList<Veiculo> listaVeiculos;
    
    public VeiculoTableModel(ArrayList<Veiculo> arrayVeiculos){
        this.listaVeiculos = arrayVeiculos;
    }
    
    @Override
    public Object getValueAt(int linha, int coluna){
        Veiculo veiculoObject = listaVeiculos.get(linha);
        return switch (coluna) {
            case 0 -> veiculoObject.getCodigo();
            case 1 -> veiculoObject.getMarca();
            case 2 -> veiculoObject.getModelo();
            case 3 -> veiculoObject.getChassi();
            case 4 -> veiculoObject.getAno();
            default -> "";
        };
    }
    
    @Override
    public int getColumnCount(){
        return 5;
    }
    
    @Override
    public int getRowCount(){
        return listaVeiculos.size();
    }
    
    @Override
    public String getColumnName(int coluna){
        return switch (coluna) {
            case 0 -> "Código";
            case 1 -> "Marca";
            case 2 -> "Modelo";
            case 3 -> "Chassi";
            case 4 -> "Ano";
            default -> "";
        };
    }
}
