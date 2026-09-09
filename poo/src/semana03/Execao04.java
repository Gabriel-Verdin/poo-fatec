package semana03;

import javax.swing.JOptionPane;

public class Execao04 {

    public static void main(String[] args) {
        
        String[] nomes = {"Ana", "Carlos"};
        String s = JOptionPane.showInputDialog("Idade?");

        try {
            int a = Integer.parseInt(s);
            JOptionPane.showMessageDialog(null, "Idade: " + a);

            int calculo = 1000 / a;
            JOptionPane.showMessageDialog(null, "Calculo: " + calculo);

            JOptionPane.showMessageDialog(null, nomes[2]);
        }

        catch(NumberFormatException | ArithmeticException erro) {
        }
        catch(ArrayIndexOutOfBoundsException erro) {
        }

        /*
        catch(NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "A idade deve ser um número inteiro: " + erro);
        }
        catch(ArithmeticException erro) {
            JOptionPane.showMessageDialog(null, "A idade não deve ser zero: " + erro);
        }
        catch(ArrayIndexOutOfBoundsException erro) {
            JOptionPane.showMessageDialog(null, "Elemento da lista não existe: " + erro);
        }
        finally { // Realizar encerramento de recursos
            JOptionPane.showMessageDialog(null, "Bloco encerrado");
        }
        */

        /*
        catch(Exception erro) {
            if(erro.toString().contains("Numer")) {
                JOptionPane.showMessageDialog(null, "Erro de conversão");
            }
            else if(erro.toString().contains("zero")) {
                JOptionPane.showMessageDialog(null, "Idade não pode ser zero");
            }
            // JOptionPane.showMessageDialog(null, "Deu pau: " + erro);
        }
        */

    }

}
