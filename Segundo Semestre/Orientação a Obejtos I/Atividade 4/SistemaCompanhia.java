import java.io.*;

public class SistemaCompanhia {
    private Companhia c1;
    private BufferedReader reader;


    public static void main(String[] args) throws Exception{
        SistemaCompanhia sc = new SistemaCompanhia();
        sc.c1 = new Companhia();
        sc.reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Insira o nome do Aeroporto:");
        sc.c1.setAeroporto(sc.reader.readLine());

        System.out.println("Insira o nome da Companhia:");
        sc.c1.setNome(sc.reader.readLine());

        System.out.println("Insira o CNPJ da Companhia:");
        sc.c1.setCnpj(sc.reader.readLine());
        
        sc.menu();
    }

    public void menu() throws Exception{
        String opcao = "";

        while(!opcao.equals("5")){
            System.out.println("------------ SISTEMA DE COMPANHIA ------------");
            System.out.println("[1] Cadastrar Voo");
            System.out.println("[2] Listar Voo");
            System.out.println("[3] Listar Passageiro de Voo");
            System.out.println("[4] Assentos livres de um Voo");
            System.out.println("[5] Sair");

            opcao = this.reader.readLine();

            if(opcao.equals("1")){
                this.cadastrarVoo();
            }else if(opcao.equals("2")){
                this.listarVoo();
            }else if(opcao.equals("3")){
                this.consulPassageiro();
            }else if(opcao.equals("4")){
                System.out.println("Teste");
            }else{
                System.out.println("Opção Inexistente!");
            }
        }
    }

    public void cadastrarVoo(){
        try{
            Voo voo = new Voo();

            System.out.println("\n ------------ VOO ------------");
            System.out.println("Numero do Voo:");
            String numVoo = this.reader.readLine();
            voo.setNumVoo(Integer.parseInt(numVoo));

            System.out.println("Modelo do Avião:");
            voo.setModAviao(this.reader.readLine());

            System.out.println("Origem:");
            voo.setOrigem(this.reader.readLine());

            System.out.println("Destino:");
            voo.setDestino(this.reader.readLine());

            System.out.println("Data e Hora da Decolagem:");
            voo.seDataHoraDecolagem(this.reader.readLine());

            for(int i = 0; i <3; i++){
                System.out.println("\n ------------ PASSAGEIROS ------------");
                System.out.println("Insira o nome do passageiro:");
                String nomePassageiro = this.reader.readLine();
                if(nomePassageiro.equals("")){
                    break;
                }
                Passageiro passageiro = new Passageiro();
                passageiro.setNome(nomePassageiro);

                System.out.println("Insira o numero de passaporte:");
                passageiro.setPassaporte(this.reader.readLine());

                System.out.println("Insira a naturalidade:");
                passageiro.setPais(this.reader.readLine());

                System.out.println("Insira o sexo:");
                passageiro.setSexo(this.reader.readLine());

                System.out.println("Insira a idade:");
                String n1 = this.reader.readLine();
                passageiro.setIdade(Integer.parseInt(n1));

                voo.setPassageiro(i, passageiro);
            }
            this.c1.setVoo(voo);
        }catch(Exception c1){
            System.out.println("Formato Invalido!!!");
        }
    }

    public void listarVoo() throws Exception{
        System.out.println("\n ------------ VOO'S CADASTRADOS ------------");

        for(int i = 0; i < this.c1.getQtVoo(); i++){
			String linha = "Numero de Voo: " + this.c1.getVoo(i).getNumVoo();
			
			System.out.print(linha);
			
			linha = " - Destino: " + this.c1.getVoo(i).getDestino();
			System.out.print(linha);
			
			linha = " - Origem: " + this.c1.getVoo(i).getOrigem();
			System.out.print(linha);

            linha = " - Data e Hora Decolagem: " + this.c1.getVoo(i).getDataHoraDecolagem();
			System.out.print(linha);
		}
    }

    public void consulPassageiro(){
		try{
			System.out.println("\n ------------ PASSAGEIROS DO VOO ------------");
			System.out.println("Informe o numero do Voo: ");
			int numVoo = Integer.parseInt(this.reader.readLine());
			boolean achou = false;
			
			for(int i = 0; i < this.c1.getQtVoo(); i++){
				Voo v = this.c1.getVoo(i);
				if(v.getNumVoo() == numVoo){
					System.out.println("Passageiros Voo:");
					int pos = 0;
					while(v.getPassageiro(pos) != null){
						String linha = "Nome: " + v.getPassageiro(pos).getNome();
						System.out.print(linha);
						
					    linha = "Passaporte: " + v.getPassageiro(pos).getPassaporte();
						System.out.print(linha);

                        linha = "Pais: " + v.getPassageiro(pos).getPais();
						System.out.print(linha);

                        linha = "Idade: " + v.getPassageiro(pos).getIdade();
						System.out.print(linha);
						pos++;
					}
					achou = true;
					break;
				}
			}
			if(!achou){
				System.out.println("Voo nao encontrada");
			}
		}catch(Exception c1){
			System.out.println("formato invalido...");
		}
	}
}