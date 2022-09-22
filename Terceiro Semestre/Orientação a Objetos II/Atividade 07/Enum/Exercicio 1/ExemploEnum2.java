enum Nivel{
    BAIXO,
    MEDIO,
    ALTO
}
public class ExemploEnum2 {
    public static void main(String[] args) {
        Nivel nivelAtual = Nivel.MEDIO;

        switch (nivelAtual) {
            case MEDIO:
                System.out.println("Nivel Médio");
                break;
        
            default:
                break;
        }
    }
}
