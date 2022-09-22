public class ExemploAtributosFinal {
    private final int codigo = 1;
    public static void main(String[] args) {
        final float pi = 3.14f;
        //pi = 2;

        ExemploAtributosFinal exemplo = new ExemploAtributosFinal();

        System.out.println("codigo vale " + exemplo.codigo);
    }

    
}