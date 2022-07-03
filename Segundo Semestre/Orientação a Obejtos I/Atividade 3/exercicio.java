import java.util.Scanner;

public class exercicio {
    Scanner entrada = new Scanner(System.in);

    int vetA = new int[5];
    String vetB = new String[5];

    System.out.println("Entre com as palavras:");

    vetA = entrada.nextLine();

    System.out.println(vetA);

    entrada.close();
}
