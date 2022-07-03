import java.io.*;
public class Gravar{


    public void gravaVenda(String a, BufferedWriter arqGravacao) throws IOException{
        String grava = a;
        arqGravacao.newLine();
        arqGravacao.write(grava);
        arqGravacao.close();
    }

}