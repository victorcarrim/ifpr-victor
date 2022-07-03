import java.io.*;
import java.util.Scanner;

public class Venda{

    public static void main(String[] args) throws Exception{
        Scanner ler = new Scanner(System.in);
        int quantidade;
        Float percentual, venda, custo;
        String entrada, nome, saidaVenda, codigo, cabecalho, saidaCompra, categoria;
        
        System.out.println("Insira o nome do arquivo de estoque: ");
        entrada = ler.nextLine();

        System.out.println("Insira o percentual de lucro para os produtos: ");
        percentual = ler.nextFloat();
        percentual = percentual / 100;

        String arqSaida = "venda.csv";
	    BufferedWriter arqGravacao = new BufferedWriter(new FileWriter(arqSaida));
        cabecalho = "codigo;nome;venda";
        arqGravacao.write(cabecalho);
        arqGravacao.newLine();

        String arqSaidaCompra = "comprar.csv";
        BufferedWriter arqGravacao2 = new BufferedWriter(new FileWriter(arqSaidaCompra));
        cabecalho = "codigo;estoque;nome;custo;categoria";
        arqGravacao2.write(cabecalho);
        arqGravacao2.newLine();

        
        BufferedReader arqLeitura = new BufferedReader(new FileReader(entrada));
		String linha;
		
		while((linha = arqLeitura.readLine()) != null){
            String dados[] = linha.split(";");
            codigo = dados[0];
            nome = dados[2];
            custo = Float.parseFloat(dados[3]);
            quantidade = Integer.parseInt(dados[1]);
            categoria = dados[4];
            venda = custo + (percentual * custo);

            if(quantidade<10){
                saidaCompra = codigo + ";" + quantidade + ";" + nome + ";" + custo + ";" + categoria;
                arqGravacao2.write(saidaCompra);
                arqGravacao2.newLine();
            }

            saidaVenda = codigo + ";" + nome + ";" + venda;

            arqGravacao.write(saidaVenda);
            arqGravacao.newLine();
            
		}

        arqGravacao.close();
        arqGravacao2.close();
    }

}
