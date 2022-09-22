import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SistemaAeroporto {

	public static void main(String[] args) throws IOException {
		SistemaAeroporto SM = new SistemaAeroporto();
		
		SM.Menu();
	}

	public void Menu() throws IOException {
	
			Integer aux = 0;
		
			ManipulaAeroporto ae = new ManipulaAeroporto();
	
			Scanner ler = new Scanner(System.in);
			
			System.out.println("--------- Disney Aeroportos ---------\n");
			
			do {
				System.out.println("\n--------- Menu ---------");
				System.out.println("[1] Cadastrar Aeroportos \n[2] Listar Aeroportos \n[3] Remover Aeroporto \n[4] Listar dados de Aeroporto \n[5] Sair");
				aux = ler.nextInt();
				
				
				switch(aux) {
				case 1:
					ae.cadastraAeroporto();
					break;
				
				case 2:
					ae.listaAeroportos();
					break;
					
				case 3:
					ae.removeAeroportos();
					break;
					
				case 4:
                    ae.consultaAeroporto();
                    break;
					
				case 5:
					System.out.println("Saindo...");
					aux = 6;
					break;
					
				default:
					break;
				}
			} while (aux != 6);
			ler.close();
			
	}
	
	
}
