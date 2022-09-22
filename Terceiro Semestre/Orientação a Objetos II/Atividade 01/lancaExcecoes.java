import java.io.*;

public class lancaExcecoes{
    public static void main(String[] args) throws Exception{
        lancaExcecoes le = new lancaExcecoes();
        le.lerArquivos();
    }

    public void lerArquivos() throws Exception{
        String arqEntrada = "arquivo.txt";
        BufferedReader arq = new BufferedReader(new FileReader(arqEntrada));
        String linha;
        
        while((linha = arq.readLine()) != null){
            System.out.println(linha + "\n");
        }

        arq.close();
    }
}