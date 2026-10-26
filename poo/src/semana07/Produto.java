package semana07;

public class Produto {

    public int codigo;
    public String descricao;
    public double preco;
    public String corPredominante;
    public boolean novo;
    public char categoria;

    // Pode ser criado quantos construtores quiser (Seguindo a regra da assinatura) 

    public Produto() {

    }

    public Produto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }


    public Produto(int codigo, String descricao, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Produto(int codigo, String descricao, double preco, String corPredominante) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.corPredominante = corPredominante;
    }

    public void mostrar() {
        System.out.println(codigo);
        System.out.println(descricao);
        System.out.println(preco);
        System.out.println(corPredominante);
        System.out.println(novo);
        System.out.println(categoria);
    }
}
