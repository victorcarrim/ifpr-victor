import java.util.ArrayList;

public class Aniversariante {
    private String dataAniversario;
    private ArrayList<String> nomes = new ArrayList<nomes>();

    public void setNome(String nome){
        nomes.add(nome);
    }

    public ArrayList<String> getNomes() {
        return nomes;
    }

    public void getNome(){
        for(Aniversariantes ani : nomes){
            System.out.println("Nome do aniversariante: " + ani);
        }
    }
    public String getDataAniversario() {
        return dataAniversario;
    }
    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    
    
}
