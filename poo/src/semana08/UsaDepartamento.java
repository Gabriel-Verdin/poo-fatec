package semana08;

public class UsaDepartamento {

    public static void main(String[] args) {
        
        Departamento d = new Departamento();
        d.id = 1;
        d.nome = "RH";

        Funcionario f1 = new Funcionario();
        f1.id = 15;
        f1.nome = "Ana";

        Funcionario f2 = new Funcionario();
        f2.id = 17;
        f2.nome = "Bia";

        Funcionario f3 = new Funcionario();
        f3.id = 25;
        f3.nome = "Carla";

        d.adicionar(f1);
        d.adicionar(f2);
        d.mostrar();

        d.adicionar(f3);
        d.mostrar();

    }

}
