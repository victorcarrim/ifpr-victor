public class exercicio {
    public static void main (String[] args){
        String s1, s2, s3;
        int i1, i2;
        
        s1 = "IFPR - Campus Foz do Iguacu - Avenida Araucaria, 780, Bairro Vila A - CEP: 85860-000 - Foz do Iguaçu - Parana - (45)3422-5348";
        
        s2 = s1.substring(74, 83);

        s3 = s1.substring(121, 125);

        i1 = Integer.parseInt(s3);

        i2 = i1 / 2;

        System.out.println("CEP:" + s2);

        System.out.println("TELEFONE: "
            + s1.substring(s1.indexOf("("), s1.length())
        );

        System.out.println(i2);
    }
    
}
