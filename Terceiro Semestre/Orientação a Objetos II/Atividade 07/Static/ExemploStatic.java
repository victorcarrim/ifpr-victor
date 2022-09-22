public class ExemploStatic{
    private String nome;
    private static int x;
    private int y;

    public static void main(String[] args) {
        x = 5;
        // y = 6;

        ExemploStatic ex1 = new ExemploStatic();
        ex1.y = 8;
        ex1.nome = "A";
        ex1.testar();

        ExemploStatic ex2 = new ExemploStatic();
        ex2.y = 10;
        ex2.nome = "B";
        ex2.testar();
        x = 2;
        ex1.testar();
    }

    private void testar(){
        System.out.println("Nome = " + this.nome);
        System.out.println("X = " + this.x);
        System.out.println("Y = " + this.y);
    }
}