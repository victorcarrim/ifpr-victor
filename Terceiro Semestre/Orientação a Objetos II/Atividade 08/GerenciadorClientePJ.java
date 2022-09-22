import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorClientePJ {
    Scanner scanner;
    DaoClientePJ daoClientePJ;

    public GerenciadorClientePJ(){
        scanner = new Scanner(System.in);
        daoClientePJ = new DaoClientePJ();
    }

    public void menu(){
        int opcao = -1;
        while(opcao != 0){
			System.out.println("\n------------------------------------------");
			System.out.println("GERENCIAMENTO DE CLIENTES PJ");
			System.out.println("[1] Cadastrar");
			System.out.println("[2] Consultar");
			System.out.println("[3] Alterar");
			System.out.println("[4] Excluir");
			System.out.println("[5] Listar todos");
			System.out.println("[0] Voltar ao menu anterior");
			System.out.println("\n------------------------------------------");

            try{
                opcao = Integer.parseInt(scanner.nextLine());
            }catch(Exception e){
                System.out.println("Erro... informe um numero inteiro. " 
                    + e.getMessage());
            }

            if(opcao == 1){
                this.cadastrar();
            }else if(opcao == 2){
                this.consultar();
            }else if(opcao == 3){
                this.alterar();
            }else if(opcao == 4){
                this.excluir();
            }else if(opcao == 5){
                this.listarTodos();
            }
        }
    }

    public void cadastrar(){
		ClientePJ cliPJ = new ClientePJ();
		System.out.println("\n--------------------------------------------------------------");
		System.out.println("[Cadastro de Clientes Pessoa Juridica]");
		System.out.println("Nome: ");
		cliPJ.setNome(scanner.nextLine());
		System.out.println("CNPJ: ");
		cliPJ.setCnpj(scanner.nextLine());

		EnderecoPJ end = new EnderecoPJ();
		System.out.println("[Endereco]");
		System.out.println("Rua: ");
		end.setRua(scanner.nextLine());
		System.out.println("Numero: ");
		end.setNumero(Integer.parseInt(scanner.nextLine()));
		System.out.println("Bairro: ");
		end.setBairro(scanner.nextLine());
		System.out.println("CEP: ");
		end.setCep(scanner.nextLine());

        cliPJ.setEnderecoPJ(end);
        boolean inserido = daoClientePJ.inserir(cliPJ);
        if(inserido){
            System.out.println("Inserido com sucesso.");
        }
    }

    private void listarTodos(){
        ArrayList<ClientePJ> resultado = daoClientePJ.buscarTodos();
        System.out.println("---------------------------");
        System.out.println("Clientes PJ cadastrados:");
        for(ClientePJ cli : resultado){
            System.out.println("Nome: " + cli.getNome()
                + ", CNPJ: " + cli.getCnpj()
                + ", Codigo: " + cli.getCodigoClientePJ());
            System.out.println("     [Endereço]: "
                + ", Rua: " + cli.getEnderecoPJ().getRua()
                + ", Num: " + cli.getEnderecoPJ().getNumero()
                + ", Bairro: " + cli.getEnderecoPJ().getBairro()
                + ", CEP: " + cli.getEnderecoPJ().getCep());
        }
    }

    public void excluir(){
        System.out.println("---------------------------");
        System.out.println("[Exclusão de clientes PJ]");
        System.out.println("Codigo: ");
        int codigo = Integer.parseInt(scanner.nextLine()); 
        int qtde = daoClientePJ.excluir(codigo);
        if(qtde > 0){
            System.out.println("Excluído com sucesso");
        }else{
            System.out.println("Não encontrado...");
        }
    }

    private void consultar(){
        System.out.println("-=-=-=-=-=-=-=-=- CONSULTAR =-=-=-=-=-=-=-=-");
        System.out.println("Insira o codigo do cliente: ");
        Integer id = Integer.parseInt(scanner.nextLine());
        ClientePJ cli = daoClientePJ.consultar(id);
        if(cli != null){
            System.out.println("Nome: " + cli.getNome()
                + ", CNPJ: " + cli.getCnpj()
                + ", Codigo: " + cli.getCodigoClientePJ());
            System.out.println("     [Endereço]: "
                + ", Rua: " + cli.getEnderecoPJ().getRua()
                + ", Num: " + cli.getEnderecoPJ().getNumero()
                + ", Bairro: " + cli.getEnderecoPJ().getBairro()
                + ", CEP: " + cli.getEnderecoPJ().getCep());
        }
        
    }    

    private void alterar(){
        
    }     
}
