package semana08;

public class UsaPessoa {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
            
        p1.nome = "Keila";
        p2.nome = "Wander";
        p3.nome = "Varlei";

        p1.parceiro = p2;
        p2.parceiro = p1;

        p1.mostrar();
        System.out.println();
        p2.mostrar();
        System.out.println();
        p3.mostrar();

    }

}
