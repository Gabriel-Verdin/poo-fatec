package semana08;

public class Pessoa {

    public String nome;
    public Pessoa parceiro;

    public void mostrar() {
        System.out.println("Nome: " + nome);

        if (parceiro != null) {
            System.out.println("Parceiro: " + parceiro.nome);
            return;
        }
        System.out.println("Solteiro");
    }

}
