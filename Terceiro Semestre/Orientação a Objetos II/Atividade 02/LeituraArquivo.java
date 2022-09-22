import java.io.*;

public class LeituraArquivo {
    private String nome;
    private String data;
  

    public void leArquivo(String arqEntrada) throws Exception{
        BufferedReader arq = new BufferedReader(new FileReader(arqEntrada));
        String linha;
        while((linha = arq.readLine()) != null){
            String dado[] = linha.split(";");
            nome = dado[0];
            data = dado[1];
        }
    }

    public String getNome(){
        return this.nome;
    }

    public String getData(){
        return this.data;
    }
}
