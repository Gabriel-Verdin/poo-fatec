package semana07;

public class UsaPessoa {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa(100);
        Pessoa p3 = new Pessoa("Gabriel");
        Pessoa p4 = new Pessoa(100, "Gabriel");

        System.out.println(p1);
        p1.mostrar();
        System.out.println("--------------");

        System.out.println(p2);
        p2.mostrar();
        System.out.println("--------------");

        System.out.println(p3);        
        p3.mostrar();
        System.out.println("--------------");

        System.out.println(p4);        
        p4.mostrar();
        System.out.println("--------------");

        Pessoa p = new Pessoa();
        PessoaFisica pf = new PessoaFisica();
        Funcionario func = new Funcionario();

        System.out.println("\n=== Pessoa ===");
        p.codigo = 100;
        p.nome = "Gabriel";
        // p.digitar();
        p.mostrar();
        // System.out.println(p.getClass());

        System.out.println("\n=== Pessoa Física ===");
        pf.codigo = 100;
        pf.nome = "Gabriel";
        pf.cpf = "123456"; // Específico de PessoaFisica
        // pf.digitar();
        pf.mostrar(); 
        // System.out.println(pf.getClass());

        System.out.println("\n=== Funcionário ===");
        func.codigo = 12;
        func.nome = "Estagiário";
        func.cpf = "4561";
        func.salario = 1000.00;
        // func.digitar();
        func.mostrar();
        // System.out.println(func.getClass());

        System.out.println("\n=== Funcionário com Construtor ===");
        Funcionario func1 = new Funcionario(2, "Cleber", "456123", 1233.12);

        func1.mostrar();
    }

}
