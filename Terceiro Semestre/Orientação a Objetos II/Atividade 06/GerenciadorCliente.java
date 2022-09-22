import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorCliente {
    Scanner scanner;
    DaoCliente daoCliente;

    public GerenciadorCliente(){
        scanner = new Scanner(System.in);
        daoCliente = new DaoCliente();
    }

    public void Menu(){
        int aux = -1;
        while(aux != 0){
			System.out.println("\n--------- Gerenciamento de Cliente ---------");
			System.out.println("[1] Cadastrar \n[2] Consultar\n[3] Alterar\n[4] Excluir\n[5] Listar Todos\n[0] Voltar ao menu anterior");
			
            try{
                aux = Integer.parseInt(scanner.nextLine());

                switch(aux){
                    case 1:
                    this.cadastrar();
                    break;

                    case 2:
                    this.consultarCliente();
                    break;

                    case 3:
                    this.alterar();
                    break;

                    case 4:
                    this.excluirCliente();
                    break;

                    case 5: 
                    this.listarTodos();
                    break;

                    default:
                    break;
                }
            }catch(Exception e){
                System.out.println("Erro: Informe um numero inteiro" + e.getMessage());
            }
        }
    }

    public void cadastrar() throws DataInvalidaException{
        System.out.println("\n--------- Cadastro de Cliente ---------\n");
        Cliente cliente = new Cliente();

        try{

        System.out.println("Digite o nome do Cliente: ");
        cliente.setNome(scanner.nextLine());
        System.out.println("Digite o CPF do Cliente: ");
        cliente.setCpf(scanner.nextLine());
        System.out.println("Digite a data de nascimento do Cliente (dd/mm/aaaa): ");
        cliente.setDataNascimentoGC(scanner.nextLine());
        System.out.println("Digite o telefone do Cliente: ");
        cliente.setTelefone(scanner.nextLine());
        } catch(DataInvalidaException e1){
            System.out.println(e1.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        boolean inserido = daoCliente.inserir(cliente);
        if(inserido){
            System.out.println("Inserido com Sucesso!!");
        }
    }
    
    private void alterar(){
        System.out.println("\n--------- Alterar Cliente ---------\n");
        System.out.println("Informe o código do cliente que deseja alterar: ");
        int codigo = Integer.parseInt(scanner.nextLine());
        Cliente c = daoCliente.consultar(codigo);
        int alt;
        try{
            if(c != null){
                System.out.println("[1] Alterar Nome\n[2] Alterar CPF\n[3] Alterar Data de Nascimento\n[4] Alterar Telefone\n[0] sair");
                alt = Integer.parseInt(scanner.nextLine());
                switch(alt){
                    case 1:
                    System.out.println("Nome Atual: " + c.getNome());
                    System.out.println("Novo Nome: ");
                    c.setNome(scanner.nextLine());
                    break;
                    case 2:
                    System.out.println("CPF Atual: " + c.getCpf());
                    System.out.println("Nova CPF: ");
                    c.setCpf(scanner.nextLine());
                    break;
                    case 3:
                    System.out.println("Data de Nascimento Atual: " + c.getDataNascimentoGC());
                    System.out.println("Nova Data de Nascimento (dd-mm-aaaa): ");
                    c.setDataNascimentoGC(scanner.nextLine());
                    break;
                    case 4:
                    System.out.println("Telefone Atual: " + c.getTelefone());
                    System.out.println("Novo Telefone: ");
                    c.setTelefone(scanner.nextLine());
                    break;
                    case 0:
                    System.out.println("Nada Alterado");
                    alt = -1;
                    break;
                }
                int qtde = daoCliente.alterarCliente(c);
                if(qtde == 1 && alt > 0){
                    System.out.println("Alterado!");
                }
            } else {
                System.out.println("Não Encontrado!");
            }
        } catch(DataInvalidaException e1){
            System.out.println(e1.getMessage());
        } catch (Exception e2){
            System.out.println(e2.getMessage());
        }
    }

    private void consultarCliente(){
        System.out.println("\n--------- Consulta de Cliente ---------\n");
        System.out.println("Informe o código do cliente que deseja consultar: ");
        int codigo = Integer.parseInt(scanner.nextLine());
        Cliente c = daoCliente.consultar(codigo);
        if(c != null){
            System.out.println("--------------------------------------");
            System.out.println("Código: " + c.getCodigo());
            System.out.println("Nome: " + c.getNome());
            System.out.println("CPF: " + c.getCpf());
            System.out.println("Data de Nascimento: " + c.getDataNascimentoGC());
            System.out.println("Telefone: " + c.getTelefone());
            System.out.println("--------------------------------------");
        } else {
            System.out.println("Não Encontrado!");
        }
    }

    private void listarTodos(){
        ArrayList<Cliente> resultado = daoCliente.listarTodos();
        System.out.println("\n--------- Cliente Cadastrados ---------\n");

        for(Cliente c: resultado){
            System.out.println("Código: " + c.getCodigo());
            System.out.println("Nome: " + c.getNome());
            System.out.println("CPF: " + c.getCpf());
            System.out.println("Data de Nascimento: " + c.getDataNascimentoGC());
            System.out.println("Telefone: " + c.getTelefone());
            System.out.println("--------------------------------------");
        }
    }

    private void excluirCliente(){
        System.out.println("\n--------- Excluir Cliente ---------\n");
        System.out.println("Qual cliente deseja excluir? ");
        int excluir = Integer.parseInt(scanner.nextLine());
        try{
        int sinal = daoCliente.excluir(excluir);
        if(sinal == 1){
            System.out.println("Excluido com Sucesso!!");
        } else {
            System.out.println("Não Encontrado!");
        }} catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
