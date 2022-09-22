import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SistemaAniversarios {

	public static void main(String[] args) throws IOException {
		SistemaAniversarios SM = new SistemaAniversarios();
		
		SM.Menu();
	}

	public void Menu() throws IOException {
	
			Integer aux = 0;
		
			ManipulaAniversariante ani = new ManipulaAniversariante();
	
			Scanner ler = new Scanner(System.in);
			
			System.out.println("--------- Disney Aniversários ---------\n");
			
			do {
				System.out.println("\n--------- Menu ---------");
				System.out.println("[1] Cadastrar Aniversarios \n[2] Listar Datas de Aniversariantes \n[3] Listar Aniversariantes \n[4] Sair");
				aux = ler.nextInt();
				
				
				switch(aux) {
				case 1:
					ani.cadastraAniversariante();
					break;

				case 2:
					ani.listarDatas();
					break;

				case 3:
					ani.listarNomes();
					break;
				}
			} while (aux != 6);
			ler.close();
			
	}
	
	
}
