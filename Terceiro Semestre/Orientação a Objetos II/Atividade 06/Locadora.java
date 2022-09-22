import java.util.Scanner;

public class Locadora {
    public static void main(String[] args) {
        Locadora loc = new Locadora();

        loc.Menu();
    }

    public void Menu(){
        int aux = -1;
        Scanner ler = new Scanner(System.in);
        while(aux != 0){
			System.out.println("\n--------- Menu Principal ---------");
			System.out.println("[1] Gerenciar Veiculos \n[2] Gerenciar Clientes\n[0] Sair");
			
            aux = Integer.parseInt(ler.nextLine());
            
            switch(aux){
                case 1:
                GerenciadorVeiculo gv = new GerenciadorVeiculo();
                gv.Menu();
                break;

                case 2:
                GerenciadorCliente gc = new GerenciadorCliente();
                gc.Menu();
                break;
            }
        }
    }
}
