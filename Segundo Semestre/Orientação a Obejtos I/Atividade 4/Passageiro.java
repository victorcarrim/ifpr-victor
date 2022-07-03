public class Passageiro {

    private String nome;
    private String passaporte;
    private String pais;
    private String sexo;
    private int idade;


    public String getNome(){
        return this.nome;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public String getPassaporte(){
        return this.passaporte;
    }

    public void setPassaporte(String p){
        this.passaporte = p;
    }

    public String getPais(){
        return this.pais;
    }

    public void setPais(String pa){
        this.pais = pa;
    }

    public String getSexo(){
        return this.sexo;
    }

    public void setSexo(String s){
        this.sexo = s;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int i){
        this.idade = i;
    }
    
}
