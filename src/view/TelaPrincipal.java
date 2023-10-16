package view;

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
		btnCadastrar.setLocation(30, 50);
		btnCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new TelaCadastroFuncionario();
			}
		});
		
		btnConsulta = new JButton("Consultar Funcionario");
		btnConsulta.setSize(200, 50);
		btnConsulta.setLocation(30, 120);
		btnConsulta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new TelaConsulta();
			}
		});
		
		cont.add(btnCadastrar);
		cont.add(btnConsulta);
	}
	
	public static void main(String[] args) {
		TelaPrincipal principal = new TelaPrincipal();
	}
}