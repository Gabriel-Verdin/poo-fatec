package semana08;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

    public int id;
    public String nome;
 
    public List<Funcionario> funcionarios = new ArrayList<Funcionario>(); // Serve
    // public Funcionario[] funcionario; // Também serve

    public void adicionar(Funcionario f) {
        funcionarios.add(f);
    }

    public void mostrar() {
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Funcionarios do " + nome + ":");
        for(Funcionario f:funcionarios) {
            System.out.println(f.id + " - " + f.nome);
        }
    }
}
