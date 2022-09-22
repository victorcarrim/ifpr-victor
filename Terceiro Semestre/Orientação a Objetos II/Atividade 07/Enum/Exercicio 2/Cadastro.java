public class Cadastro{
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.setEstadoCivil(EstadoCivil.CASADO);
        System.out.println(p1.getEstadoCivil());

        PessoaEnum p2 = new PessoaEnum();

        p2.setEstadoCivil(EstadoCivilEnum.SOLTEIRO);
        System.out.println(p2.getEstadoCivil());
    }
}