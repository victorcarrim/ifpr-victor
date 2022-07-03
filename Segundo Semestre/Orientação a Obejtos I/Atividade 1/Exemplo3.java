public class Exemplo3 {
    public static void main(String[]args){
        int resultado;
        float resultado1;

        OperacoesMatematicas opMat = new OperacoesMatematicas();
        resultado = opMat.somar(2,3);
        System.out.println("2+3 = " + resultado);

        resultado = opMat.subtrair(5,9);
        System.out.println("5-9 = " + resultado);

        resultado = opMat.multiplicar(7,3);
        System.out.println("7*3 = " + resultado);

        resultado1 = opMat.dividir(15,9);
        System.out.println("7/9 = " + resultado1);
    }    
}
