import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class DaoCliente{
    private Connection conn;
    private Statement st;
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    private void conectar(){
        try{
            this.conn = GerenciadorConexao.pegarConexao();
            st = conn.createStatement();
        } catch (ClassNotFoundException e1){
            System.out.println(e1.getMessage());
        } catch (SQLException e2){
            System.out.println(e2.getMessage());
        }
    }

    private void desconectar(){
        try{
            st.close();
            conn.close();
        } catch (SQLException e){
            System.out.println("Erro ao fechar a conexão: " + e.getMessage());
        }
    }

    public boolean inserir(Cliente c){
        boolean result = false;
        try {
            this.conectar();
            String data = c.getDataNascimentoBD().toString();
            Date dataFormatada = Date.valueOf(data);
			String comando = "INSERT INTO tb_clientes VALUES (NULL, '"
				+ c.getNome() + "', '" + dataFormatada + "', '"
				+ c.getCpf() + "', '" + c.getTelefone() + "');";
            
            //System.out.println(comando);
            st.executeUpdate(comando);
            result = true;
        } catch (SQLException e) {
            System.out.println("Erro ao inserir o registro: " 
                + e.getMessage());
        }finally{
            this.desconectar();
        }
        return result;
    }
    
    public ArrayList<Cliente> listarTodos(){
        ArrayList<Cliente> resultados = new ArrayList<Cliente>();

        try {
            this.conectar();
            ResultSet rs = st.executeQuery("select * from tb_clientes order by codigo;");
            while(rs.next()){
                Cliente c = new Cliente();
                c.setCodigo(rs.getInt("codigo"));
                c.setNome(rs.getString("nome"));
                c.setCpf(rs.getString("cpf"));
                c.setTelefone(rs.getString("telefone"));
                Date data = rs.getDate("data_nascimento");
                LocalDate data2 = data.toLocalDate();
                c.setDataNascimentoBD(data2);

                resultados.add(c);
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally{
            this.desconectar();
        }

        return resultados;
    }

    public Cliente consultar(int cod){
        Cliente c = null;
        try {
            this.conectar();
            ResultSet rs = st.executeQuery("select * from tb_clientes where codigo = " + cod + ";");
            if(rs.next()){
                c = new Cliente();
                c.setCodigo(rs.getInt("codigo"));
                c.setNome(rs.getString("nome"));
                c.setCpf(rs.getString("cpf"));
                Date data = rs.getDate("data_nascimento");
                LocalDate data2 = data.toLocalDate();
                c.setDataNascimentoBD(data2);
                c.setTelefone(rs.getString("telefone"));
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally{
            this.desconectar();
        }
        return c;
    }

      public int alterarCliente(Cliente c){
        int qtde = 0;
        try {
            this.conectar();
            String data = c.getDataNascimentoBD().toString();
            Date dataFormatada = Date.valueOf(data);
            String comando = "update tb_clientes set nome = '" + c.getNome() + "', data_nascimento = '" + dataFormatada + "', cpf = '" + c.getCpf() + "', telefone = " + c.getTelefone() + " where codigo = " + c.getCodigo() + ";";
            st.executeUpdate(comando);
            qtde = st.getUpdateCount();
            
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally{
            this.desconectar();
        }

        return qtde;
      }

    public int excluir(int cod){
        int qtde = 0;
        try {
            this.conectar();
            String comando = "delete from tb_clientes where codigo = " + cod + ";";
            st.executeUpdate(comando);
            qtde = st.getUpdateCount();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            this.desconectar();
        }

        return qtde;
    }
}