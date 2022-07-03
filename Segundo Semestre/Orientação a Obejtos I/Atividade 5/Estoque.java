public class Estoque {

    public String setCodigo(String codigoProv){
        String codigo[] = codigoProv.split(";");
        return codigo[0];
    }

    public int setEstoque(String estoqueProv){
        String estoqueFinal[] = estoqueProv.split(";");
        return Integer.parseInt(estoqueFinal[1]);
    }

    public String setNome(String nomeProv){
        String nome[] = nomeProv.split(";");
        return nome[2];
    }

    public float setCusto(String custoProv){
        String custo[] = custoProv.split(";");
        
        return Float.parseFloat(custo[3]);
    }

    public String setCategoria(String categoriaProv){
        String categoria[] = categoriaProv.split(";\\s");
        return categoria[4];
    }
    
}
