/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package locadora_swing;

import java.util.ArrayList;
import model.DaoVeiculo;
import model.Veiculo;
import view.VeiculoView;

/**
 *
 * @author victorferrari
 */
public class Locadora_Swing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello Word");
        
        DaoVeiculo dao = new DaoVeiculo();
        
        ArrayList<Veiculo> veiculos = dao.listarTodos();
        
        for(Veiculo v : veiculos){
            System.out.println(v.getMarca() + "|" + v.getModelo());
        }
        
        new VeiculoView().setVisible(true);
    }
    
}
