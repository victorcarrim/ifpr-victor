import java.io.*;

public class ExEscritaArquivo {
	public static void main(String[] args) throws Exception{
		String arqSaida = "arqSaida.csv";
		BufferedWriter arqGravacao = new BufferedWriter(new FileWriter(arqSaida));
		
		String nomeProd = "a";
		String preco = "b";
		String linha = nomeProd + ";;" + preco;
		arqGravacao.write(linha);
		arqGravacao.newLine();
		
		linha = "bbb; 334; ytr";
		arqGravacao.write(linha);
		
		arqGravacao.close();
	}
}

