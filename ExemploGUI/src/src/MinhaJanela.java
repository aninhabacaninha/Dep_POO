package src;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MinhaJanela extends JFrame {
    JLabel label;
    JButton button;
    JTextField textField;
    
    public MinhaJanela() {
        setTitle("Meu evento canônico");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        label = new JLabel("Não aguento mais");
        label.setSize(150, 50);
        label.setLocation(15, 15);
        
        button = new JButton("Clique aqui");
        button.setLocation(15, 65);
        button.setSize(100, 50);
        
        textField = new JTextField();
        textField.setLocation(165, 15);
        textField.setSize(100, 25);
        
        Container container = getContentPane();
        container.setLayout(null);
        container.add(label);
        container.add(button);
        container.add(textField);
    }
}
