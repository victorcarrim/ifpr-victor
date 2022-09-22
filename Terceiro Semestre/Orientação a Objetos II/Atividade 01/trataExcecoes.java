import java.io.*;

public class trataExcecoes {

    public static void main(String[] args){
        trataExcecoes tr1 = new trataExcecoes();
        tr1.lerArquivos();
    }

    public void lerArquivos(){
        try{
            String arqEntrada = "arquivo.txt";
            BufferedReader arq = new BufferedReader(new FileReader(arqEntrada));
            String linha;
            
            while((linha = arq.readLine()) != null){
                System.out.println(linha + "\n");
            }
    
            arq.close();
        } catch(FileNotFoundException e1){ /// captura exceções do tipo FileNotFound
            System.out.println("Arquivo não encontrado");
        } catch(Exception e2){ /// captura exceções genéricas
            System.out.println("Erro inesperado!");
        } finally{/// executado sempre
            System.out.println("Programa encerrado!");
        }
    }
}

