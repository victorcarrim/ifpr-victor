public class ExemploExcecao {
    public static void main(String[] args) {
        ExemploExcecao ee = new ExemploExcecao();

        ee.calcular();
        System.out.println("Fim...");
        }

    public void calcular(){
        try{
            float res;
            OperacoesMatematicas opm = new OperacoesMatematicas();
            res = opm.dividir(3, 2);
            System.out.println(res);
            res = opm.dividir(4, 0);
            System.out.println(res);
        }catch(DivisaoPorZeroException div){
            System.out.println("Descrição do erro: " + div.getMessage());
        }
    }
}
