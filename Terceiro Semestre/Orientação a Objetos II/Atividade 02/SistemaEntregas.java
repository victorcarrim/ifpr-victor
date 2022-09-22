import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class SistemaEntregas{

    public static void main (String[] args){
        SistemaEntregas SM = new SistemaEntregas();

        SM.menu();

    }

    public void menu(){
        try{
        Scanner ler = new Scanner(System.in);
        LeituraArquivo leitura = new LeituraArquivo();
        CalculoEntrega calculo = new CalculoEntrega();
       
        System.out.println("------------ Sistema de Entregas --------------\n");
        System.out.println("Insira o nome do arquivo a ser importado: ");
        String arqEntrada = ler.nextLine();
        ler.close();
        BufferedReader arq = new BufferedReader(new FileReader(arqEntrada));
        leitura.leArquivo(arqEntrada);
        calculo.setData(leitura.getData());
        calculo.calculaData();

        System.out.println("\n------------- Entrega Pedido -------------\n");
        System.out.println("Nome do Cliente: " + leitura.getNome());
        System.out.println("Data do Pedido: " + leitura.getData());
        System.out.println("Data Estimada para Entrega: " + calculo.getData());
        
        } catch (ArquivoVazioException e1){
            System.out.println(e1.getMessage());
        } catch (FileNotFoundException e2){
            System.out.println("O aquivo digitado não existe, por favor tente novamente!!!");
        } catch (DateTimeParseException e3) {
            System.out.println("Formato de data invalido, por favor corrija e tente novamente!");
        } catch (Exception io){
            System.out.println("Erro inesperado");
        }  
    }
}