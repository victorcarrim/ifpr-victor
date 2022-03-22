import java.io.*;

public class ExLeituraArquivo {
	public static void main(String[] args) throws Exception{
		String arqEntrada = "arqEntrada.txt";
		BufferedReader arqLeitura = new BufferedReader(new FileReader(arqEntrada));
		String linha;
		
		while((linha = arqLeitura.readLine()) != null){
			System.out.println(linha);
		}
		arqLeitura.close();
	}
}
