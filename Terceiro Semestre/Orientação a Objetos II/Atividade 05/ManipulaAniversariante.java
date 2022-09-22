import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ManipulaAniversariante {
    private HashMap<String, ArrayList<String>> aniversariantes = new HashMap<String, ArrayList<String>>();

    public void cadastraAniversariante(){
        Scanner ler = new Scanner(System.in);
        String data, nome;

        System.out.println("--------- Cadastro de Aniversariante ---------");
        System.out.println("Digite o dia e mês de aniversario (dd/mm): ");
        data = ler.nextLine();
        if(aniversariantes.containsKey(data)){
            System.out.println("Digite o nome do aniversariante: ");
            this.aniversariantes.get(data).add(ler.nextLine());
        } else {
            System.out.println("Digite o nome do aniversariante: ");
            nome = ler.next();
            this.aniversariantes.put(data, new ArrayList<String>());
            this.aniversariantes.get(data).add(nome);
        }
    }

    public void listarDatas(){
        System.out.println("--------- Datas de Aniversarios ---------");
        if(aniversariantes.isEmpty()){
            System.out.println("Nenhum aniversario cadastrado!");
        }else{
            for(String chave : aniversariantes.keySet()){
                System.out.println(chave);
            }
        }
    }

    public void listarNomes(){
        System.out.println("--------- Datas de Aniversarios ---------");
        Scanner ler = new Scanner(System.in);
        if(aniversariantes.isEmpty()){
            System.out.println("Nenhum aniversariante Cadastrado");
        }else{
            System.out.println("Digite a data de aniversario a ser consultada: ");
            String data = ler.nextLine();
            if(aniversariantes.containsKey(data)){
                System.out.println("\nAniversariantes do dia " + data);
                ArrayList<String> arrayListNomes = aniversariantes.get(data);
                for(String nome : arrayListNomes){
                    System.out.println(nome);
                }
            }
        }
    }


    
}
