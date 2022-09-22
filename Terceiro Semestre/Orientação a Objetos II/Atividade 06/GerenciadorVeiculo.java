import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorVeiculo {
    Scanner scanner;
    DaoVeiculo daoVeiculo;

    public GerenciadorVeiculo(){
        scanner = new Scanner(System.in);
        daoVeiculo = new DaoVeiculo();
    }

    public void Menu(){
        int aux = -1;
        while(aux != 0){
			System.out.println("\n--------- Gerenciamento de Veiculos ---------");
			System.out.println("[1] Cadastrar \n[2] Consultar\n[3] Alterar\n[4] Excluir\n[5] Listar Todos\n[0] Voltar ao menu anterior");
			
            try{
                aux = Integer.parseInt(scanner.nextLine());

                switch(aux){
                    case 1:
                    this.cadastrar();
                    break;

                    case 2:
                    this.consultarVeiculo();
                    break;

                    case 3:
                    this.alterar();
                    break;

                    case 4:
                    this.excluirVeiculo();
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

    public void cadastrar(){
        System.out.println("\n--------- Gerenciamento de Veiculos ---------\n");
        Veiculo veiculo = new Veiculo();

        System.out.println("Digite a marca do veiculo: ");
        veiculo.setMarca(scanner.nextLine());
        System.out.println("Digite o modelo do veiculo: ");
        veiculo.setModelo(scanner.nextLine());
        System.out.println("Digite o ano do veiculo: ");
        veiculo.setAno(Integer.parseInt(scanner.nextLine()));
        System.out.println("Digite o chassi do veiculo: ");
        veiculo.setChassi(scanner.nextLine());
        System.out.println("---------------------");

        boolean inserido = daoVeiculo.inserir(veiculo);
        if(inserido){
            System.out.println("Inserido com Sucesso!!");
        }
    }

    private void alterar(){
        System.out.println("\n--------- Alterar Veiculo ---------\n");
        System.out.println("Informe o código do veiculo que deseja alterar: ");
        int codigo = Integer.parseInt(scanner.nextLine());
        Veiculo v = daoVeiculo.consultar(codigo);
        int alt;
        if(v != null){
            System.out.println("[1] Alterar Marca\n[2] Alterar Modelo\n[3] Alterar Chassi\n[4] Alterar Ano\n[0] sair");
            alt = Integer.parseInt(scanner.nextLine());
            switch(alt){
                case 1:
                System.out.println("Novo Marca: ");
                v.setMarca(scanner.nextLine());
                break;
                case 2:
                System.out.println("Nova Marca: ");
                v.setMarca(scanner.nextLine());
                break;
                case 3:
                System.out.println("Novo Chassi: ");
                v.setChassi(scanner.nextLine());
                break;
                case 4:
                System.out.println("Novo Ano: ");
                v.setAno(Integer.parseInt(scanner.nextLine()));
                break;
                case 0:
                System.out.println("Nada Alterado");
                alt = -1;
                break;
            }

            int qtde = daoVeiculo.alterar(v);
            if(qtde == 1 && alt > 0){
                System.out.println("Alterado!");
            }
        } else {
            System.out.println("Não Encontrado!");
        }

    }

    private void listarTodos(){
        ArrayList<Veiculo> resultado = daoVeiculo.listarTodos();
        System.out.println("\n--------- Veiculos Cadastrados ---------\n");

        for(Veiculo v: resultado){
            System.out.println("Codigo: " + v.getCodigo());
            System.out.println("Marca: " + v.getMarca());
            System.out.println("Modelo: "+ v.getModelo());
            System.out.println("Ano: " + v.getAno());
            System.out.println("Chassi: " + v.getChassi() + "\n");
        }
    }

    private void consultarVeiculo(){
        System.out.println("\n--------- Consulta de Veiculo ---------\n");
        int codigo = Integer.parseInt(scanner.nextLine());
        Veiculo v = daoVeiculo.consultar(codigo);
        if(v != null){
            System.out.println("Modelo: "+ v.getModelo() + " Marca: " + v.getMarca() + " Ano: " + v.getAno() + " Chassi: " + v.getChassi() + " Codigo: " + v.getCodigo());
        } else {
            System.out.println("Não Encontrado!");
        }
    }

    private void excluirVeiculo(){
        System.out.println("\n--------- Excluir Veiculo ---------\n");
        System.out.println("Qual veiculo deseja excluir? ");
        int excluir = scanner.nextInt();
        daoVeiculo.excluir(excluir);
    }
}
