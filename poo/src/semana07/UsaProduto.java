package semana07;

public class UsaProduto {
    
    public static void main(String[] args) {
        
        Produto p = new Produto(); // Construtor default (falha)
        // Quando a gente não faz, a máquina faz pela gente.
        // Se quiser que isso funcione junto com o criado, é necessário criar o método default (construtor vazio).

        Produto p1 = new Produto(3, "Água"); // Construtor criado
        // Quando a gente faz, a máquina NÃO faz pela gente, então tem que usar o criado.

        p.mostrar();
        System.out.println("-------------");
        p1.mostrar();
    }

}