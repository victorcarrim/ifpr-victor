import java.util.HashMap;

public class Dias {
    public static void main(String[] args) {
        HashMap<String, String> diasSemanas = new HashMap<String, String>();

        diasSemanas.put("Seg", "Segunda-Feira");
        diasSemanas.put("Ter", "Terça-Feira");
        diasSemanas.put("Qua", "Quarta-Feira");
        diasSemanas.put("Qui", "Quinta-Feira");
        diasSemanas.put("Sex", "Sexta-Feira");
        diasSemanas.put("Sab", "Sabado");
        diasSemanas.put("Dom", "Domingo");

        System.out.println("Printar todos");
        System.out.println(diasSemanas);

        System.out.println("\nVerificar se contem um item especifico");
        System.out.println("Qua existe?" + diasSemanas.containsKey("Qua"));

        System.out.println("\nPesquisando um item:");
        System.out.println(diasSemanas.get("Ter"));

        System.out.println("\nQuantidade de pares:");
        System.out.println(diasSemanas.size());

        System.out.println("\nRemover um item");
        System.out.println(diasSemanas.remove("Ter"));
        System.out.println("Quantidade de pares:");
        System.out.println(diasSemanas.size());

        System.out.println("\nPercorrendo o conjunto de chaves:");
        for(String chave : diasSemanas.keySet()){
            System.out.println(chave);
        }

        System.out.println("\nPercorrendo o conjunto de chaves:");
        for(String valores : diasSemanas.values()){
            System.out.println(valores);
        }

        System.out.println("\nRemovendo todos os pares");
        diasSemanas.clear();
        System.out.println("Quantidade de pares:");
        System.out.println(diasSemanas.size());
    }
}
