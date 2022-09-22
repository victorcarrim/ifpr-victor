import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) throws IOException {
		Sistema SM = new Sistema();
		
		SM.Menu();
	}

	public void Menu() throws IOException {
	
			Integer aux = 0;
			String nome, apresenta;
		
			ManipulaClientes cliente = new ManipulaClientes();
			ManipulaOrcamentos orcamentos = new ManipulaOrcamentos();
	
			Scanner ler = new Scanner(System.in);
			
			System.out.println("--------- Disney Assistencia Informatica ---------\n");
			
			do {
				System.out.println("\n--------- Menu ---------");
				System.out.println("[1] Cadastrar Clientes \n[2] Listar Clientes \n[3] Cadastrar orçamento para um Cliente \n[4] Listar Orçamentos de um Cliente \n[5] Sair");
				aux = ler.nextInt();
				
				
				switch(aux) {
				case 1:
					cliente.cadastrarCliente();
					break;
				
				case 2:
					cliente.listarClientes();
					break;
					
				case 3:
					System.out.println("\nDigite o nome do cliente: ");
					cliente.listarNomes();
					nome = ler.next(); 
					orcamentos.setIdCliente(cliente.getID(nome));
					orcamentos.cadastrarCliente();
					break;
					
				case 4:
					System.out.println("\nDigite o nome do cliente: ");
					cliente.listarNomes();
					nome = ler.next(); 
					orcamentos.setIdCliente(cliente.getID(nome));
					orcamentos.listarOrcamentos();
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
