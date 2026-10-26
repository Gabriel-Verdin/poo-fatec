package semana07;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MeuPI extends JFrame {

    private JButton btOriginal;
    private MeuBotao btPersonal;

    public MeuPI() {
        setTitle("Meu PI");
        setBounds(100,100,400,200);
        setLayout(new FlowLayout());

        btOriginal = new JButton("Original");
        btPersonal = new MeuBotao("Personal");

        add(btOriginal);
        add(btPersonal);

        btOriginal.addActionListener(new ActionListener() {
            @Override 
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btOriginal, "Original");
            }
        });

        btPersonal.addActionListener(new ActionListener() {
            @Override 
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btPersonal, "Personalizado");
            }
        });
    }

    public static void main(String[] args) {
        
        MeuPI m = new MeuPI();
        m.setVisible(true);

    }

}
