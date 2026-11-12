package semana08;

public class Mulher {

    public String nome;
    public Homem marido;

    public void mostrar() {
        System.out.println(nome);
        if (marido != null) {
            System.out.println("Marido: " + marido.nome);
        }
    }

}
