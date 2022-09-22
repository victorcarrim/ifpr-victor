public class OperacoesMatematicas {
	
	public int somar(int num1, int num2){
		return num1 + num2;
	}
	
	public int subtrair(int num1, int num2){
		return num1 - num2;
	}
	
	public int multiplicar(int num1, int num2){
		return num1 * num2;
	}
	
	public float dividir(int num1, int num2) throws DivisaoPorZeroException{
		if(num2 == 0){
			throw new DivisaoPorZeroException();
		}
		return num1 / num2;
	} 
}