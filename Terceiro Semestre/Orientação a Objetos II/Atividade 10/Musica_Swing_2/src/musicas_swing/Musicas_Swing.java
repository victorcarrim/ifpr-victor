/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package musicas_swing;

import java.util.ArrayList;
import model.DaoGenerico;
import model.Musica;
import view.MusicasView;

/**
 *
 * @author victorferrari
 */
public class Musicas_Swing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        System.out.println("Hello Word");
        
        DaoGenerico daoGenerico = new DaoGenerico();
        ArrayList<Object> musicas = daoGenerico.buscarTodos(new Musica());
        for(Object o : musicas){
            Musica m = (Musica)o;
            System.out.println(m.getNomeMusica());
        }
        
        
        new MusicasView().setVisible(true);
    }
    
}
