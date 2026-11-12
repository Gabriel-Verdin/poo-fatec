package semana08;

public class UsaFuncionario {

    public static void main(String[] args) {
        
        Departamento d = new Departamento();
        d.id = 1;
        d.nome = "Desenvolvimento de Software";

        Funcionario f = new Funcionario();
        f.id = 3;
        f.nome = "Gabriel";
        f.departamento = d;

        f.mostrar();

    }

}