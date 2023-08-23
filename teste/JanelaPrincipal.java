package teste;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JanelaPrincipal extends JFrame implements ActionListener {
	private JLabel display;
	private JButton btn0, btn1, btnBackspace;
	
	public JanelaPrincipal() {
		setTitle("Minha Janela");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container container = getContentPane();
		container.setLayout(null);
		
		inicializarComponentes();
		
		container.add(display);
		container.add(btn0);
		container.add(btn1);
		container.add(btnBackspace);
	}
	
	public void inicializarComponentes() {
		display = new JLabel("0");
		display.setLocation(10, 10);
		display.setSize(3*75, 80);
		
		final int altura = 75;
		final int largura = 75;
		Dimension dimensao = new Dimension(largura, altura);
		
		btn0 = new JButton("0");
		btn0.setLocation(10, 100);
		btn0.setSize(dimensao);
		btn0.addActionListener(this);
		
		btn1 = new JButton("1");
		btn1.setLocation(85, 100);
		btn1.setSize(dimensao);
		btn1.addActionListener(this);
		
		btnBackspace = new JButton("<");
		btnBackspace.setLocation(160, 100);
		btnBackspace.setSize(dimensao);
		btnBackspace.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn0) {
			String textoDisplay = display.getText();
			textoDisplay = textoDisplay + "0";
			display.setText(textoDisplay);
		} else if(e.getSource() == btn1) {
			String textoDisplay = display.getText();
			textoDisplay = textoDisplay + "1";
			display.setText(textoDisplay);
		} else if(e.getSource() == btnBackspace) {
			String textoDisplay = display.getText();
			textoDisplay = textoDisplay.substring(0, textoDisplay.length()-1);
			display.setText(textoDisplay);
		}
	}
}
