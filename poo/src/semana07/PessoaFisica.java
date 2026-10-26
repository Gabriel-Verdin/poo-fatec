package semana07;

import javax.swing.JOptionPane;

public class PessoaFisica extends Pessoa {

    public String cpf;

    public PessoaFisica() {

    }

    public PessoaFisica(int codigo, String nome, String cpf) {
        super(codigo, nome); // Chama o construtor da superclasse
        this.cpf = cpf;
    }

    // Método Sobrescrito -----------------------------------------------------
    // public void digitar() {
    //     codigo = Integer.parseInt(JOptionPane.showInputDialog("Código? "));
    //     nome = JOptionPane.showInputDialog("Nome? ");
    //     cpf = JOptionPane.showInputDialog("CPF? ");
    // }

    // Método reutilizado da classe mãe
    @Override // Notation (Indica que esse método é um método sobrescrito)
    public void digitar() {
        super.digitar();
        cpf = JOptionPane.showInputDialog("CPF? ");
    }

    /**
     * Apresenta em tela o estado atual do objeto pessoaFisica
     */
    @Override
    public void mostrar() { // Método Sobrescrito
        super.mostrar();
        System.out.println(cpf);
    }

}
