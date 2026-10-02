package semana06;

// Exercício Encapsulamento
// 3. Faça uma classe contendo atributos e métodos para implementar uma TV. Devem existir
// métodos para mudar o canal (de 0 a 999) e para definir o brilho contendo três valores (baixo,
// médio e alto). Elaborar também a classe UsaTv para testar as funcionalidades.

public class UsaTelevisao {

    public static void main(String[] args) {
        
        Televisao televisao = new Televisao();

        televisao.aumentarCanal();
        televisao.aumentarCanal();
        televisao.aumentarCanal();
        televisao.redizirCanal();

        televisao.setCanal(200);
        televisao.setCanal(1200);

        televisao.setBrilho("Baixo");
        televisao.setBrilho("Alto");
        
        televisao.mostrar();

    }

}
