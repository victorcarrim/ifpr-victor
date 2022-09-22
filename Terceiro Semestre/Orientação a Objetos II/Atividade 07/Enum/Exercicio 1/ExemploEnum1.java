public class ExemploEnum1{
    enum Turno{
        MANHA,
        TARDE,
        NOITE
    }

    public static void main(String[] args) {
        Turno turnoCurso = Turno.NOITE;

        System.out.println(turnoCurso);
    }
}