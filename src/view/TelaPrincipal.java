package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaPrincipal extends JFrame {
	JButton btnCadastrar, btnConsulta;
	
	public TelaPrincipal() {
		setTitle("Principal");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setVisible(true);
		
		Container cont = getContentPane();
		
		btnCadastrar = new JButton("Cadastrar Funcionario");
		btnCadastrar.setSize(200, 50);
		btnCadastrar.setLocation(30, 30);
		
		btnConsulta = new JButton("Consultar FuNCIONARIO");
		
		cont.add(btnCadastrar);
	}
	
	public static void main(String[] args) {
		TelaPrincipal principal = new TelaPrincipal();
	}
}
