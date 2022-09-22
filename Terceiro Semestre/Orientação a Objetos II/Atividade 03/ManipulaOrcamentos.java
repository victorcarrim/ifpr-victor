import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ManipulaOrcamentos{
    
	private ArrayList<Orcamentos> listaOrcamentos = new ArrayList<Orcamentos>();
	private Iterator<Orcamentos> itt = listaOrcamentos.iterator();
	String idCliente;


    public void cadastrarCliente() throws IOException{
        String produtos, valorTotal, idOrcamento;
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        Orcamentos o1 = new Orcamentos();

        System.out.println("------------------- Cadastro de Orçamento -------------------");
        System.out.println("Digite o id do Orçamento: ");
        idOrcamento = ler.readLine();
        o1.setIdOrcamento(idOrcamento);
        System.out.println("Digite os nomes dos produtos: ");
        produtos = ler.readLine();
        o1.setProdutos(produtos);
        System.out.println("Digite o valor total: ");
        valorTotal = ler.readLine();
        o1.setValorTotoal(valorTotal);
        o1.setIdCliente(idCliente);
        listaOrcamentos.add(o1);
        
    }

    public void listarOrcamentos() {
    	System.out.println("------------------- Lista de Orçamentos do Cliente-------------------");
    	for(Orcamentos orc: listaOrcamentos) {
            if(orc.getIdCliente().equals(idCliente)){
                System.out.println("\nProduto:  " + orc.getProdutos());
    		    System.out.println("Valor:  " + orc.getValorTotoal());
            }
            else {
                System.out.println("Cliente não possui orçamento!!!");
            } 
    		
        }
    }
    	
    public String setIdCliente(String id) {
    	return this.idCliente = id;
    }
    	
    
    
}