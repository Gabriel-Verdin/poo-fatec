package atividadeExercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculadoraLista06 extends JFrame{

    JLabel labelNum01, labelNum02, labelResultado;
    JTextField textNum01, textNum02, textResultado;
    JButton btSomar, btSubtrair, btMultiplicar, btDividir, btPotencia, btRaiz, btSair;

    public CalculadoraLista06() {
        
        setTitle("Calculadora");
        setSize(400, 360);
        setResizable(false);
        setLayout(null); // Layout livre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Encerra o app ao fechar
        setLocationRelativeTo(null); // Centraliza a janela no monitor            

        // Label
        labelNum01 = new JLabel("Número 01: ");
        labelNum02 = new JLabel("Número 02: ");
        labelResultado = new JLabel("Resultado: ");

        labelNum01.setBounds(80, 20, 100, 25);
        labelNum02.setBounds(80, 60, 100, 25);
        labelResultado.setBounds(80, 100, 100, 25);

        add(labelNum01);
        add(labelNum02);
        add(labelResultado);

        // Text Field
        textNum01 = new JTextField();
        textNum02 = new JTextField();
        textResultado = new JTextField();
        textResultado.setEditable(false);

        textNum01.setBounds(190, 20, 130, 25);
        textNum02.setBounds(190, 60, 130, 25);
        textResultado.setBounds(190, 100, 130, 25);

        add(textNum01);
        add(textNum02);
        add(textResultado);

        // Button
        btSomar = new JButton("Somar");
        btSubtrair = new JButton("Subtrair");
        btMultiplicar = new JButton("Multiplicar");
        btDividir = new JButton("Dividir");
        btPotencia = new JButton("Potência");
        btRaiz = new JButton("Raiz");
        btSair = new JButton("Sair");

        btSomar.setBounds(95, 150, 100, 25);
        btSubtrair.setBounds(205, 150, 100, 25);
        
        btMultiplicar.setBounds(95, 185, 100, 25);
        btDividir.setBounds(205, 185, 100, 25);
        
        btPotencia.setBounds(95, 220, 100, 25);
        btRaiz.setBounds(205, 220, 100, 25);
        
        btSair.setBounds(95, 255, 210, 25);     

        add(btSomar);
        add(btSubtrair);
        add(btMultiplicar);
        add(btDividir);
        add(btPotencia);
        add(btRaiz);
        add(btSair);

        // Listener
        btSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double n1 = Double.parseDouble(textNum01.getText());
                    double n2 = Double.parseDouble(textNum02.getText());

                    double soma = n1 + n2;
                    
                    textResultado.setText(""+soma);
                } catch (NumberFormatException ex) {
                    textResultado.setText("Erro: Entrada inválida");
                }
            }
        });

        btSubtrair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double n1 = Double.parseDouble(textNum01.getText());
                    double n2 = Double.parseDouble(textNum02.getText());

                    double subtracao = n1 - n2;
                    
                    textResultado.setText(""+subtracao);
                } catch (NumberFormatException ex) {
                    textResultado.setText("Erro: Entrada inválida");
                }
            }
        });

        btMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double n1 = Double.parseDouble(textNum01.getText());
                    double n2 = Double.parseDouble(textNum02.getText());

                    double multiplicacao = n1 * n2;
                    
                    textResultado.setText(""+multiplicacao);
                } catch (NumberFormatException ex) {
                    textResultado.setText("Erro: Entrada inválida");
                }
            }
        });

        btDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double n1 = Double.parseDouble(textNum01.getText());
                    double n2 = Double.parseDouble(textNum02.getText());

                    double divisao = n1 / n2;

                    textResultado.setText(""+divisao);
                } catch (NumberFormatException ex) {
                    textResultado.setText("Erro: Entrada inválida");
                }
            }
        });

        btPotencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double n1 = Double.parseDouble(textNum01.getText());
                    double n2 = Double.parseDouble(textNum02.getText());

                    double potencia = Math.pow(n1, n2);

                    textResultado.setText(""+potencia);
                } catch (NumberFormatException ex) {
                    textResultado.setText("Erro: Entrada inválida");
                }
            }
        });

        btRaiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double n1 = Double.parseDouble(textNum01.getText());

                    if (n1 < 0) {
                        textResultado.setText("Erro: Raiz de número negativo");
                    } else {
                        double raiz = Math.sqrt(n1);
                        textResultado.setText(""+raiz);
                    }
                } catch (NumberFormatException ex) {
                    textResultado.setText("Erro: Entrada inválida");
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

    // Aplicação
    public static void main(String[] args) {
        
        CalculadoraLista06 frame = new CalculadoraLista06();
        frame.setVisible(true);

    }

}
