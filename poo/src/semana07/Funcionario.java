package semana07;

import javax.swing.JOptionPane;

public class Funcionario extends PessoaFisica {

    public double salario;

    public Funcionario() {

    }

    public Funcionario(double salario) {
        this.salario = salario;
    }

    public Funcionario(int codigo, String nome, String cpf, double salario) {
        super(codigo, nome, cpf); // Chama o construtor da superclasse
        this.salario = salario;
    }

    // Método reutilizado da classe mãe
    @Override // Notation (Indica que esse método é um método sobrescrito)
    public void digitar() {
        super.digitar();
        salario = Double.parseDouble(JOptionPane.showInputDialog("Salário? "));
    }

    /**
     * Apresenta em tela o estado atual do objeto pessoaFisica
     */
    @Override
    public void mostrar() { // Método Sobrescrito
        super.mostrar();
        System.out.println(salario);
    }

}
