import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class ManipulaAeroporto {
    private HashMap<String, Aeroporto> aeroportos = new HashMap<String, Aeroporto>();
    

    public void cadastraAeroporto(){
        Scanner ler = new Scanner(System.in);

        Aeroporto ae = new Aeroporto();

        System.out.println("\n------------------- Cadastro de Aeroporto -------------------\n");
        System.out.println("Digite o nome do Aeroporto: ");
        ae.setNome(ler.nextLine());
        System.out.println("\nDigite a Cidade: ");
        ae.setCidade(ler.nextLine());
        System.out.println("\nDigite a Altitude: ");
        ae.setAltura(ler.nextLine());
        System.out.println("\nDigite a sigla do aeroporto: ");
        aeroportos.put(ler.nextLine(), ae);
    }

    public void listaAeroportos(){
        System.out.println("\n------------------- Aeroportos Cadastrados -------------------\n");
        if(aeroportos.isEmpty()){
            System.out.println("Nenhum aeroporto cadastrado!");
        }else{
            for(String chave : aeroportos.keySet()){
                System.out.println("Aeroporto de " + aeroportos.get(chave).getNome());
            }
        }
    }

    public void removeAeroportos(){
        Scanner ler = new Scanner(System.in);
        System.out.println("\n------------------- Remoção de Aeroporto -------------------\n");
        if(aeroportos.isEmpty()){
            System.out.println("Nenhum aeroporto cadastrado!");
        }else{
            System.out.println("Aeroportos Cadastrados:  ");
            for(String chave : aeroportos.keySet()){
                System.out.println("Aeroporto de " + aeroportos.get(chave).getNome() + ". Sigla: "+ chave);
            }
            System.out.println("\nDigite a sigla do aeroporto que deseja remover: ");
            String sigla = ler.next();
            if(aeroportos.containsKey(sigla) == true){
                aeroportos.remove(sigla);
                System.out.println("Aeroporto removido com sucesso!!!");
            } else {
                System.out.println("Aeroporto não existe!!!");
            }
        }
    }

    public void consultaAeroporto(){
        Scanner ler = new Scanner(System.in);
        System.out.println("\n------------------- Consulta de Aeroporto -------------------\n");
        if(aeroportos.isEmpty()){
            System.out.println("Nenhum aeroporto cadastrado!");
        }else{
            System.out.println("Aeroportos Cadastrados:");
            for(String chave : aeroportos.keySet()){
                System.out.println("Aeroporto de " + aeroportos.get(chave).getNome() + ". Sigla: "+ chave);
            }
            System.out.println("\nDigite a sigla do aeroporto que deseja consultar: ");
            String sigla = ler.nextLine();

            System.out.println("\nNome:  " + aeroportos.get(sigla).getNome());
            System.out.println("Cidade:  " + aeroportos.get(sigla).getCidade());
            System.out.println("Altura:  " + aeroportos.get(sigla).getAltura());	
        }
    }

}
