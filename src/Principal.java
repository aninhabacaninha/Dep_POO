package src;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal extends JFrame implements ActionListener {
	
	JButton button, btn;
	
	public Principal() {
		setTitle("Minha Janela");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		
		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());
		
		button = new JButton("Clique aqui!");
		button.addActionListener(this);
		
		btn = new JButton("Teste");
		btn.addActionListener(this);
		
		cont.add(button);
		cont.add(btn);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			JOptionPane.showMessageDialog(null, e.getActionCommand());
		}
		
		if(e.getSource() == btn) {
			JOptionPane.showMessageDialog(null, "Tchau");
		}
	}
	
	public static void main(String[] args) {
		Principal janela = new Principal();
		janela.setVisible(true);
	}
}
