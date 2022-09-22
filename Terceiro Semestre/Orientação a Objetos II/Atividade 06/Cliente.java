import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {
    private int codigo;
    private String nome;
    private LocalDate dataNascimento;
    private String cpf;
    private String telefone;

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getDataNascimentoBD() {
        return dataNascimento;
    }
    public LocalDate setDataNascimentoGC(String data_nascimento) throws DataInvalidaException{
        LocalDate data = LocalDate.parse(data_nascimento, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        String data2 = data.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate data3 = LocalDate.parse(data2, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return this.dataNascimento = data3;
    }
    public LocalDate setDataNascimentoBD(LocalDate data_nascimento) {
        return this.dataNascimento = data_nascimento;
    }
    public String getDataNascimentoGC(){
        String data = this.dataNascimento.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        return data;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
}
