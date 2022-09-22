import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ManipulaClientes{
    
	private ArrayList<Clientes> listaClientes = new ArrayList<Clientes>();
	private Iterator<Clientes> it = listaClientes.iterator();

    String idCliente;


    public void cadastrarCliente() throws IOException{
        String nome, cpf, endereco, telefone, idCliente;
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        Clientes c1 = new Clientes();

        System.out.println("------------------- Cadastro de Cliente -------------------");
        System.out.println("Digite o id do Cliente: ");
        idCliente = ler.readLine();
        c1.setIdCliente(idCliente);
        System.out.println("Digite o nome do Cliente: ");
        nome = ler.readLine();
        c1.setNome(nome);
        System.out.println("Digite o CPF do Cliente: ");
        cpf = ler.readLine();
        c1.setCpf(cpf);
        System.out.println("Digite o endereço do Cliente: ");
        endereco = ler.readLine();
        c1.setEndereco(endereco);
        System.out.println("Digite o telefone do Cliente: ");
        telefone = ler.readLine();
        c1.setTelefone(telefone);
        listaClientes.add(c1);
        
    }
    
    public void listarClientes() {
    	System.out.println("\n------------------- Lista de Clientes-------------------");
    	for(Clientes cli: listaClientes) {
    		System.out.println("\nNome:  " + cli.getNome());
    		System.out.println("CPF:  " + cli.getCpf());
    		System.out.println("Endereço:  " + cli.getEndereco());
    		System.out.println("Telefone:  " + cli.getTelefone());
        }
    }
    
    public void listarNomes() {
    	for(Clientes cli: listaClientes) {
    		System.out.println("\nNome:  " + cli.getNome());
        }
    }
    	
    public String getID(String nome) {

    	for(Clientes cli: listaClientes) {
            if(cli.getNome().equals(nome)){
                idCliente = cli.getIdCliente();
            }
            else {
                System.out.println("Cliente não cadastrado!!!");
            }  
    	}
        return idCliente;        
    }
    	
    
    
}