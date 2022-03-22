import java.io.*;
import java.util.Scanner;

public class Venda{

    public static void main(String[] args) throws Exception{
        Scanner ler = new Scanner(System.in);
        int quantidade;
        float percentual, custo, venda;
        String entrada, codigo, nome;
        Estoque estoque = new Estoque();
        Gravar gravar = new Gravar();
        
        System.out.println("Insira o nome do arquivo de estoque: ");
        entrada = ler.next();

        System.out.println("Insira o percentual de lucro para os produtos: ");
        percentual = ler.nextFloat();
        percentual = percentual / 100;

        String arqSaida = "venda.csv";
	    BufferedWriter arqGravacao = new BufferedWriter(new FileWriter(arqSaida));
        
        BufferedReader arqLeitura = new BufferedReader(new FileReader(entrada));
		String linha;
		
		while((linha = arqLeitura.readLine()) != null){
            codigo = estoque.setCodigo(linha);
            nome = estoque.setNome(linha);
            custo = estoque.setCusto(linha);
            quantidade = estoque.setEstoque(linha);
            venda = custo + (percentual * custo);

            String dados = codigo + ";" + nome + ";" + venda;
 
            System.out.println(dados);

            arqGravacao.write(dados);
            arqGravacao.newLine();
            arqGravacao.close();

		}
    }
}
