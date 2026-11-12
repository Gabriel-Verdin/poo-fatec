package semana08;

public class Funcionario {

    public int id;
    public String nome;
    public Departamento departamento;

    public void mostrar() {
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Departamento: " + departamento.nome);
    }

}
