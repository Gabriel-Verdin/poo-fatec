package atividadeExercicios;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class GerenciarLampadaEncaps extends JFrame {

    private LampadaEncaps lampada01 = new LampadaEncaps();
    private LampadaEncaps lampada02 = new LampadaEncaps();
    private LampadaEncaps lampada03 = new LampadaEncaps();

    private JLabel labelStatus01, labelStatus02, labelStatus03;

    public GerenciarLampadaEncaps() {
        setTitle("Gerenciador de Lâmpadas");
        setSize(480, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);

        // Lâmpada 01
        JLabel labelLampada01 = new JLabel("Lâmpada 01:");
        labelLampada01.setBounds(20, 30, 80, 25);
        add(labelLampada01);

        labelStatus01 = new JLabel("Status: " + lampada01.getEstadoAtual());
        labelStatus01.setBounds(100, 30, 100, 25);
        add(labelStatus01);

        JButton buttonApagar01 = new JButton("Apagar");
        JButton buttonAcender01 = new JButton("Acender");
        JButton buttonMeia01 = new JButton("Meia-Luz");

        buttonApagar01.setBounds(200, 30, 80, 25);
        buttonAcender01.setBounds(285, 30, 85, 25);
        buttonMeia01.setBounds(375, 30, 85, 25);

        add(buttonApagar01);
        add(buttonAcender01);
        add(buttonMeia01);

        // Lâmpada 02
        JLabel labelLampada02 = new JLabel("Lâmpada 02:");
        labelLampada02.setBounds(20, 80, 80, 25);
        add(labelLampada02);

        labelStatus02 = new JLabel("Status: " + lampada02.getEstadoAtual());
        labelStatus02.setBounds(100, 80, 100, 25); 
        add(labelStatus02);

        JButton buttonApagar02 = new JButton("Apagar");
        JButton buttonAcender02 = new JButton("Acender");
        JButton buttonMeia02 = new JButton("Meia-Luz");

        buttonApagar02.setBounds(200, 80, 80, 25);
        buttonAcender02.setBounds(285, 80, 85, 25);
        buttonMeia02.setBounds(375, 80, 85, 25);

        add(buttonApagar02);
        add(buttonAcender02);
        add(buttonMeia02);


        // Lâmpada 03
        JLabel labelLampada03 = new JLabel("Lâmpada 03:");
        labelLampada03.setBounds(20, 130, 80, 25);
        add(labelLampada03);

        labelStatus03 = new JLabel("Status: " + lampada03.getEstadoAtual());
        labelStatus03.setBounds(100, 130, 100, 25);
        add(labelStatus03);

        JButton buttonApagar03 = new JButton("Apagar");
        JButton buttonAcender03 = new JButton("Acender");
        JButton buttonMeia03 = new JButton("Meia-Luz");

        buttonApagar03.setBounds(200, 130, 80, 25);
        buttonAcender03.setBounds(285, 130, 85, 25);
        buttonMeia03.setBounds(375, 130, 85, 25);

        add(buttonApagar03);
        add(buttonAcender03);
        add(buttonMeia03);

        // Ações Lâmpada 01
        buttonApagar01.addActionListener(e -> { 
            lampada01.apagar(); 
            atualizarInterface(); 
        });
        buttonAcender01.addActionListener(e -> { 
            lampada01.acender(); 
            atualizarInterface(); 
        });
        buttonMeia01.addActionListener(e -> { 
            lampada01.ajustarMeiaLuz(); 
            atualizarInterface(); 
        });

        // Ações Lâmpada 02
        buttonApagar02.addActionListener(e -> { 
            lampada02.apagar(); 
            atualizarInterface(); 
        });
        buttonAcender02.addActionListener(e -> { 
            lampada02.acender(); 
            atualizarInterface(); 
        });
        buttonMeia02.addActionListener(e -> { 
            lampada02.ajustarMeiaLuz(); 
            atualizarInterface(); 
        });

        // Ações Lâmpada 03
        buttonApagar03.addActionListener(e -> { 
            lampada03.apagar(); 
            atualizarInterface(); 
        });
        buttonAcender03.addActionListener(e -> { 
            lampada03.acender(); 
            atualizarInterface(); 
        });
        buttonMeia03.addActionListener(e -> {   
            lampada03.ajustarMeiaLuz(); 
            atualizarInterface(); 
        });

        // Botão para exibir estados das lâmpadas
        JButton buttonExibirGeral = new JButton("Exibir Estados Geral");
        buttonExibirGeral.setBounds(130, 200, 210, 30);
        
        buttonExibirGeral.addActionListener(e -> {
            String mensagem = "Estado Atual das Lâmpadas:\n\n" +
                             "Estado Lâmpada 01: " + lampada01.getEstadoAtual() + "\n" +
                             "Estado Lâmpada 02: " + lampada02.getEstadoAtual() + "\n" +
                             "Estado Lâmpada 03: " + lampada03.getEstadoAtual();
            JOptionPane.showMessageDialog(this, mensagem, "Estados das Lâmpadas", JOptionPane.INFORMATION_MESSAGE);
        });
        add(buttonExibirGeral);

    }

    public void atualizarInterface() {
        labelStatus01.setText(lampada01.getEstadoAtual().toString());
        labelStatus02.setText(lampada02.getEstadoAtual().toString());
        labelStatus03.setText(lampada03.getEstadoAtual().toString());
    }

    public static void main(String[] args) {
        GerenciarLampadaEncaps lampada = new GerenciarLampadaEncaps();
        lampada.setVisible(true);
    }
}
