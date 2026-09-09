package semana03;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame01 extends JFrame {

    JLabel lbNum1, lbNum2,lbTotal;
    JTextField tfNum1, tfNum2, tfTotal;
    JButton btSomar, btSubtrair, btMultiplicar, btDividir, btSair;

    public Frame01() { // Definir as caracteristicas da tela

        setTitle("My First Frame");
        setBounds(100, 100, 300, 300);
        setResizable(false);
        setLayout(null); // Layout livre

        lbNum1 = new JLabel("Número 01: ");
        lbNum2 = new JLabel("Número 02: ");
        lbTotal = new JLabel("Total: ");    

        lbNum1.setBounds(10, 20, 100, 25);
        lbNum2.setBounds(10, 60, 100, 25);
        lbTotal.setBounds(10, 100, 100, 25);

        add(lbNum1);
        add(lbNum2);
        add(lbTotal);

        tfNum1 = new JTextField();
        tfNum2 = new JTextField();
        tfTotal = new JTextField();
        tfTotal.setEditable(false);

        tfNum1.setBounds(130, 20, 100, 25);
        tfNum2.setBounds(130, 60, 100, 25);
        tfTotal.setBounds(130, 100, 100, 25);

        add(tfNum1);
        add(tfNum2);
        add(tfTotal);

        btSomar = new JButton("Somar");
        btSubtrair = new JButton("Subtrair");
        btMultiplicar = new JButton("Multiplicar");
        btDividir = new JButton("Dividir");
        btSair = new JButton("Sair");

        btSomar.setBounds(10, 140, 100, 25);
        btSubtrair.setBounds(140, 140, 100, 25);
        btMultiplicar.setBounds(10, 180, 100, 25);
        btDividir.setBounds(140, 180, 100, 25);
        btSair.setBounds(10, 220, 230, 25);

        add(btSomar);
        add(btSubtrair);
        add(btMultiplicar);
        add(btDividir);
        add(btSair);

        btSomar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int n1 = Integer.parseInt(tfNum1.getText());
                    int n2 = Integer.parseInt(tfNum2.getText());

                    int soma = n1 + n2;
                    
                    tfTotal.setText(""+soma);
                }
                catch(NumberFormatException erro) { 
                    JOptionPane.showMessageDialog(null, "Forneça dois valores interios");
                    tfNum1.requestFocus();
                }
            }
        });

        btSubtrair.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int n1 = Integer.parseInt(tfNum1.getText());
                    int n2 = Integer.parseInt(tfNum2.getText());

                    int subtracao = n1 - n2;
                    
                    tfTotal.setText(""+subtracao);
                }
                catch(NumberFormatException erro) { 
                    JOptionPane.showMessageDialog(null, "Forneça dois valores interios");
                    tfNum1.requestFocus();
                }
            }
        });

        btMultiplicar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int n1 = Integer.parseInt(tfNum1.getText());
                    int n2 = Integer.parseInt(tfNum2.getText());

                    int multiplicacao = n1 * n2;
                    
                    tfTotal.setText(""+multiplicacao);
                }
                catch(NumberFormatException erro) { 
                    JOptionPane.showMessageDialog(null, "Forneça dois valores interios");
                    tfNum1.requestFocus();
                }
            }
        });

        btDividir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int n1 = Integer.parseInt(tfNum1.getText());
                    int n2 = Integer.parseInt(tfNum2.getText());

                    int divisao = n1 / n2;
                    
                    tfTotal.setText(""+divisao);
                }
                catch(NumberFormatException erro) { 
                    JOptionPane.showMessageDialog(null, "Forneça dois valores interios");
                    tfNum1.requestFocus();
                }
            }
        });

        btSair.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        
        Frame01 f = new Frame01();
        f.setVisible(true);

    }

}