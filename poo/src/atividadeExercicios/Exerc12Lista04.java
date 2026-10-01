package atividadeExercicios;

import javax.swing.JOptionPane;

public class Exerc12Lista04 {

    public static void main(String[] args) {
        
        while(true) {

            String nome = JOptionPane.showInputDialog("Digite seu nome: ");

            if (nome.length() < 5) {
                JOptionPane.showMessageDialog(null, "Nome inválido. O nome deve ter pelo menos 5 caracteres.");
                continue;
            }

            String idadeStr = JOptionPane.showInputDialog("Digite sua idade: ");
            try {
                int idade = Integer.parseInt(idadeStr);
                if (idade < 0 || idade > 150) {
                    JOptionPane.showMessageDialog(null, "Idade inválida. A idade deve estar entre 0 e 150.");
                    continue;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Idade inválida. Digite um número inteiro.");
                continue;
            }

            String salario = JOptionPane.showInputDialog("Digite seu salário: ");
            try {
                double salarioDouble = Double.parseDouble(salario);
                if (salarioDouble <= 0) {
                    JOptionPane.showMessageDialog(null, "Salário inválido. O salário deve ser maior que zero.");
                    continue;   
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Salário inválido. Digite um número válido");
                continue;
            }

            String sexo = JOptionPane.showInputDialog("Digite seu sexo (M/F): ");
            if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
                JOptionPane.showMessageDialog(null, "Sexo inválido. Digite 'M' para masculino ou 'F' para feminino.");
                continue;
            }
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
            break;
        }

    }

}
