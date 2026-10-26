package semana07;

import javax.swing.JOptionPane;

// Sobrecaga: (overload)
// Cria métodos com o mesmo nome, porém assinaturas diferentes, na mesma classe OU **** em uma subclasse ****

// Sobrescrita: (overrides)
// Cria métodos com a mesma assinatura dentro de uma hierarquia de classes (superclasse - subclasse)

public class Pessoa {

    public int codigo;
    public String nome;
    
    public Pessoa() { // Método Construtor

    }

    public Pessoa(int codigo) { // Método Construtor
        this.codigo = codigo;
    }

    public Pessoa(String nome) { // Método Construtor
        this.nome = nome;
    }

    public Pessoa(int codigo, String nome) { // Método Construtor
        this.codigo = codigo;
        this.nome = nome;      
    }

    public void digitar() {
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Código? "));
        nome = JOptionPane.showInputDialog("Nome? ");
    }

    /**
     * Apresenta em tela o estado atual do objeto pessoa
     */ 
    public void mostrar() {
        System.out.println(codigo);
        System.out.println(nome);
    }

    @Override // O método toString já existe na classe Object, por isso preciso Sobrescrever o método (Override)
    public String toString() {
        return "Pessoa [codigo=" + codigo + ", nome=" + nome + "]";
    }

}
