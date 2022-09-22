import java.util.HashMap;

public class CadEstados {
    

    public static void main(String[] args) {
        HashMap<String, Estado> estados = new HashMap<String, Estado>();
        Estado e1 = new Estado();

        e1.setNome("Parana");
        e1.setRegiao("Oeste");
        estados.put("PR", e1);

        Estado e2 = new Estado();
        e2.setNome("Sao Paulo");
        e2.setRegiao("Leste");
        estados.put("SP", e2);

        Estado e3 = new Estado();
        e3.setNome("Rio de Janeiro");
        e3.setRegiao("Norte");
        estados.put("RJ", e3);

        System.out.println("Estados Armazenados: " + estados);
        System.out.println("\nVerificando a existencia de um estado: ");
        if(estados.containsKey("PR")){
            System.out.println("PR existe no HashMaps");
        }

        System.out.println("Buscando a regiao do estado de SP");
        System.out.println(estados.get("SP").getRegiao());
    }
   
}
