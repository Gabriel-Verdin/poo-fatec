package semana08;

public class Casamento {

    public static void main(String[] args) {
        
        Mulher m = new Mulher();
        m.nome = "Ana";

        // m.mostrar();

        Homem h = new Homem();
        h.nome = "João";
        h.esposa = m;

        m.marido = h;
        m.mostrar();

    }

}
