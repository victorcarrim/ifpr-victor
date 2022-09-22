/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import model.Musica;

/**
 *
 * @author victorferrari
 */
public class MusicasTableModel extends AbstractTableModel{
    public static final int COL_CODIGO = 0;
    public static final int COL_NOME_MUSICA = 1;
    public static final int COL_ARTISTAS_MUSICA = 2;
    public static final int COL_GRAVADORA_MUSICA = 3;
    public static final int COL_TEMPO_MUSICA = 4;
    public static final int COL_DATA_PRODUCAO_MUSICA = 5;
    
    public ArrayList<Object> listaMusicas;
    
    public MusicasTableModel (ArrayList<Object> arrayMusicas){
        this.listaMusicas = arrayMusicas;
    }
    
    @Override
    public Object getValueAt(int linha, int coluna){
        Musica musicasObject = (Musica) listaMusicas.get(linha);
        return switch (coluna) {
            case 0 -> musicasObject.getIdMusica();
            case 1 -> musicasObject.getNomeMusica();
            case 2 -> musicasObject.getArtistasMusica();
            case 3 -> musicasObject.getGravadoraMusica();
            case 4 -> musicasObject.getTempoMusica();
            case 5 -> musicasObject.getDataProducaoMusica();
            default -> "";
        };
    }
    
    @Override
    public int getColumnCount(){
        return 6;
    }
    
    @Override
    public int getRowCount(){
        return listaMusicas.size();
    }
    
    @Override
    public String getColumnName(int coluna){
        return switch (coluna) {
            case 0 -> "Código";
            case 1 -> "Musica";
            case 2 -> "Artistas";
            case 3 -> "Gravadora";
            case 4 -> "Tempo";
            case 5 -> "Data de Produção";
            default -> "";
        };
    }
    
}
