package atividadeExercicios;

import javax.swing.JOptionPane;

public class Lista04Exercicio02 {

    public static void main(String[] args) {
        
        while (true) {
            String nomeUsuario = JOptionPane.showInputDialog("Digite seu nome de Usuário: ");
            String senhaUsuario = JOptionPane.showInputDialog("Digite sua senha: ");

            if (nomeUsuario.equals(senhaUsuario)) {
                JOptionPane.showMessageDialog(null, "Erro: Nome de usuário e senha não podem ser iguais. Tente novamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                break;
            }
        }

    }
}
