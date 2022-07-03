public class Companhia {
    private String nome;
    private String cnpj;
    private String aeroporto;
    private Voo[] vetVoo;
    private int qtVoo;

    public Companhia(){
        this.vetVoo = new Voo [2];
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public String getCnpj(){
        return this.cnpj;
    }

    public void setCnpj(String c){
        this.cnpj = c;
    }

    public String getAeroporto(){
        return this.aeroporto;
    }

    public void setAeroporto(String a){
        this.aeroporto = a;
    }

    public int getQtVoo(){
        return this.qtVoo;
    }

    public void setQtVoo(int qt){
        this.qtVoo = qt;
    }

    public Voo getVoo(int pos){
        return this.vetVoo[pos];
    }

    public void setVoo(Voo v){
        this.setQtVoo(this.getQtVoo() + 1);
		int pos = this.getQtVoo() - 1;
		this.vetVoo[pos] = v;
    }
}
